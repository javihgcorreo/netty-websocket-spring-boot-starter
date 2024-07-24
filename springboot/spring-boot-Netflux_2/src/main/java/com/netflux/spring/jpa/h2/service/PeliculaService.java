package com.netflux.spring.jpa.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.netflux.spring.jpa.h2.repository.PeliculaRepository;
import com.netflux.spring.jpa.h2.model.Infocast;
import com.netflux.spring.jpa.h2.model.Pelicula;
import com.netflux.spring.jpa.h2.dto.InfoPelicula;
import com.netflux.spring.jpa.h2.service.PeliculaService;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    // public PeliculaService(PeliculaRepository peliculaRepository) {
    // this.peliculaRepository = peliculaRepository;
    // }

    // public List<InfoPelicula> getAllPeliculas() {
    // // List<Pelicula> peliculas = peliculaRepository.findAll();
    // // return peliculas != null ? peliculas : Collections.emptyList();
    // // System.out.println("llamada peliculaRepository.findAll()");
    // System.err.println("intento realizar un getAllPeliculas en Service");
    // try {
    // List<Pelicula> peliculas;
    // peliculas = peliculaRepository.findAll();

    // return peliculas.stream()
    // .map(peliculas -> new InfoPelicula(
    // peliculas.getId().toString(),
    // peliculas.getUrl(),
    // peliculas.getImgUrl(),
    // peliculas.getTitle(),
    // peliculas.getDescription(),
    // peliculas.getYearFilm(),
    // peliculas.getDuration(),
    // peliculas.getDirector(),
    // peliculas.getInfocasts()))
    // .collect(Collectors.tolist());
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.err.println("intento realizar un getAllPeliculas en Service");
    // return null;
    // }

    // }

    public List<InfoPelicula> getAllPeliculas() {
        List<Pelicula> peliculas = peliculaRepository.findAll();
        if (peliculas == null) {
            return Collections.unmodifiableList(Collections.emptyList());
        }

        return peliculas.stream()
                .map(InfoPelicula::mapPeliculaToInfoPelicula)
                .collect(Collectors.toList());
    }

    public Pelicula getPeliculaById(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    public Pelicula savePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public void deletePelicula(Long id) {
        peliculaRepository.deleteById(id);
    }
}