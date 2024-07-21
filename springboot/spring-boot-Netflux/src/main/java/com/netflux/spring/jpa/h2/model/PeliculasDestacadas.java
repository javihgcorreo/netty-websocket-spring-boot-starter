package com.netflux.spring.jpa.h2.model;

//import org.hibernate.mapping.List;
//import java.util.List;

//import org.hibernate.mapping.List;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculasdestacadas")
public class PeliculasDestacadas {

    @Id
    @Column(name = "fk_peliculas_id")
    // @Column(name = "fk_peliculas_id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // este fk_peliculas es la clave ajena y principal, hacia peliculsa
    private Long fk_peliculas_id;

    @OneToOne
    @JoinColumn(name = "fk_peliculas_id")
    private Pelicula peliculas;

    // @OneToOne(mappedBy = "id")
    // private Pelicula pelicula;

    public void PeliculasDestacadas() {

    }

    public void PeliculasDestacadas(Long fk_peliculas_id) {
        this.fk_peliculas_id = fk_peliculas_id;

    }

    public long getFkPeliculaId() {
        return fk_peliculas_id;
    }

    public void setFkPeliculaId(long fk_peliculas_id) {
        this.fk_peliculas_id = fk_peliculas_id;
    }

}
