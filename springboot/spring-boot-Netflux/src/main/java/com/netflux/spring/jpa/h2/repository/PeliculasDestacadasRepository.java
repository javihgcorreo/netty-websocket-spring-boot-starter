package com.netflux.spring.jpa.h2.repository;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.netflux.spring.jpa.h2.model.Pelicula;
import com.netflux.spring.jpa.h2.model.PeliculasDestacadas;
import com.netflux.spring.jpa.h2.repository.PeliculaRepository;

@Repository
public interface PeliculasDestacadasRepository extends JpaRepository<Pelicula, Long> {
    // List<Pelicula> findByPublished(boolean published);

    // @Query("SELECT * FROM Pelicula p")
    List<Pelicula> findAll();

    // String getPeliculasHola();

    // List<Pelicula> findById(long id);

    List<Pelicula> findByTitleContainingIgnoreCase(String title);

    List<Pelicula> findByYearFilm(Integer yearFilm);

    List<Pelicula> findById(Integer id);

    // List<Object> obtenerPeliculasDestacadas();

    // List<Object> getPeliculasDestacadas();
    List<Pelicula> findAllByPeliculasDestacadasIsNotNull();

    // List<Pelicula> findAllByPeliculasDestacadasIsNotNull();

    // PeliculasDestacadas getPeliculasDestacadas();

    // String texto = "Lo que devuelvo";

}
