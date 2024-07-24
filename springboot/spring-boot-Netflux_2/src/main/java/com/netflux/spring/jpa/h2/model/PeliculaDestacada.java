package com.netflux.spring.jpa.h2.model;

//import org.hibernate.mapping.List;
//import java.util.List;

//import org.hibernate.mapping.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "peliculasdestacadas")
public class PeliculaDestacada {

    @Id
    @Column(name = "fk_peliculas_id")

    private Long fk_peliculas_id;

    @OneToOne
    @JoinColumn(name = "fk_peliculas_id")
    private Pelicula peliculas;

}
