package com.netflux.spring.jpa.h2.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

// Clase de ID compuesta

@Embeddable
public class PeliculaInfocastId implements Serializable {
    private Long peliculaId;
    private Long infocastId;

    // getters y setters
    public Long getInfocastId() {
        return infocastId;
    }

    public void setInfocastId(Long infocastId) {
        this.infocastId = infocastId;
    }

    public Long getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(Long peliculaId) {
        this.peliculaId = peliculaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PeliculaInfocastId that = (PeliculaInfocastId) o;
        return peliculaId.equals(that.peliculaId) && infocastId.equals(that.infocastId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peliculaId, infocastId);
    }
}