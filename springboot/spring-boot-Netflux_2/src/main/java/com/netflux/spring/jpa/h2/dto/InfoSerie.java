package com.netflux.spring.jpa.h2.dto;

import java.util.List;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class InfoSerie {
    private String id;
    private String url;
    private String imgURL;
    private String title;
    private String description;
    private Integer yearStart;
    private Integer yearEnd;
    private Integer seasons;
    private List<String> creators;
    private List<InfocastDTO> cast;

    // Getters y Setters

}
