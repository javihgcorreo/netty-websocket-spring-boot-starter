package com.netflux.spring.jpa.h2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas_infocast")
@IdClass(PeliculaInfocastId.class) // Clase de ID compuesta
public class PeliculaInfocast {

    @Id
    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    @Id
    @ManyToOne
    @JoinColumn(name = "infocast_id")
    private Infocast infocast;

    // Nuevo campo correspondiente al campo infocastId en PeliculaInfocastId
    @Column(name = "infocast_id", insertable = false, updatable = false)
    private Long infocastId;

    // Nuevo campo correspondiente al campo peliculaId en PeliculaInfocastId
    @Column(name = "pelicula_id", insertable = false, updatable = false)
    private Long peliculaId;

    // Otros campos si es necesario (por ejemplo, papel del actor)
    // @Column(name = "role")
    // private String role;

}
