package com.netflux.spring.jpa.h2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.netflux.spring.jpa.h2.dto.InfoDestacados;
import com.netflux.spring.jpa.h2.model.PeliculaDestacada;
import com.netflux.spring.jpa.h2.model.SerieDestacada;

import com.netflux.spring.jpa.h2.service.PeliculaDestacadaService;
import com.netflux.spring.jpa.h2.service.SerieDestacadaService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class DestacadoController {

    @Autowired
    PeliculaDestacadaService peliculaDestacadaService;

    @Autowired
    SerieDestacadaService serieDestacadaService;

    @GetMapping("/destacados")
    public ResponseEntity<List<PeliculaDestacada>> getAllDestacados() {
        try {
            List<InfoDestacados> listaInfoDestacados = new ArrayList<InfoDestacados>();

            List<PeliculaDestacada> peliculasDestacadas = new ArrayList<PeliculaDestacada>();
            List<SerieDestacada> seriesDestacadas = new ArrayList<SerieDestacada>();
            // peliculasDestacadas = peliculaDestacadaService.getAllDestacados();
            // seriesDestacadas = serieDestacadaService.getAllDestacados();

            // añado Peliculas destacadas
            // for (PeliculaDestacada peliculaDestacada : peliculasDestacadas) {
            // // Crear un objeto InfoDestacados a partir de la PeliculaDestacada
            // InfoDestacados infoDestacados = new InfoDestacados();
            // infoDestacados.setId(peliculaDestacada.getId().toString()); // Convertir ID a
            // String
            // infoDestacados.setType("film");
            // infoDestacados.setTitle(peliculaDestacada.getTitulo());
            // infoDestacados.setUrl(peliculaDestacada.getUrl());
            // infoDestacados.setImgUrl(peliculaDestacada.getImgURL());

            // // Agregar el objeto InfoDestacados a una lista final
            // listaInfoDestacados.add(infoDestacados);
            // }

            // añado Series destacadas
            // for (SerieDestacada serieDestacada : seriesDestacadas) {
            // InfoDestacados infoDestacados = new InfoDestacados();
            // infoDestacados.setId(serieDestacada.getId().toString());
            // infoDestacados.setType("serie");
            // infoDestacados.setTitle(serieDestacada.getTitulo());
            // infoDestacados.setUrl(serieDestacada.getUrl());
            // infoDestacados.setImgUrl(serieDestacada.getImgURL());

            // listaInfoDestacados.add(infoDestacados);
            // }

            if (peliculasDestacadas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(peliculasDestacadas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
