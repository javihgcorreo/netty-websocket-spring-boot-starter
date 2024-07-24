package com.netflux.spring.jpa.h2.model;

//import org.hibernate.mapping.List;
//import java.util.List;

//import org.hibernate.mapping.List;

import jakarta.persistence.*;

@Entity
@Table(name = "seriesdestacadas")
public class SerieDestacada {

    @Id
    @Column(name = "fk_series_id")
    // @Column(name = "fk_series_id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // este fk_series es la clave ajena y principal, hacia peliculsa
    private Long fk_series_id;

    @OneToOne
    @JoinColumn(name = "fk_series_id")
    private Serie series;

    // @OneToOne(mappedBy = "id")
    // private Serie serie;

    public void SeriesDestacadas() {

    }

    public void SeriesDestacadas(Long fk_series_id) {
        this.fk_series_id = fk_series_id;

    }

    public long getFkSerieId() {
        return fk_series_id;
    }

    public void setFkSerieId(long fk_series_id) {
        this.fk_series_id = fk_series_id;
    }

}
