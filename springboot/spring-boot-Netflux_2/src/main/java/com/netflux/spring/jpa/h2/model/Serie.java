package com.netflux.spring.jpa.h2.model;

//import org.hibernate.mapping.List;

import jakarta.persistence.*;

@Entity
@Table(name = "series")
public class Serie {
    /*
     * @Id
     * 
     * @Column(name = "id")
     * private String id;
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "url", length = 255, nullable = false)
    private String url;

    @Column(name = "img_url", length = 255, nullable = false)
    private String imgURL;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @Column(name = "yearstart", nullable = false)
    private Integer yearstart;

    @Column(name = "yearend", nullable = false)
    private Integer yearend;

    @Column(name = "seasons", nullable = false)
    private Integer seasons;

    @Column(name = "creators", length = 255, nullable = false)
    private String creators;

    @Column(name = "cast_series", length = 255, nullable = false)
    private String cast_series;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "serie_id")

    // private List<InfoCast> cast;

    public Serie() {

    }

    public Serie(String url, String imgURL, String title, String description,
            Integer yearstart, Integer yearend, Integer seasons, String creators, String cast_series) {
        // this.id = id;
        this.url = url;
        this.imgURL = imgURL;
        this.title = title;
        this.description = description;
        this.yearstart = yearstart;
        this.yearend = yearend;
        this.seasons = seasons;
        this.creators = creators;
        this.cast_series = cast_series;
        // this.cast = cast;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgURL;
    }

    public void setImgUrl(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearStart() {
        return yearstart;
    }

    public void setYearStart(Integer yearstart) {
        this.yearstart = yearstart;
    }

    public Integer getYearEnd() {
        return yearend;
    }

    public void setYearEnd(Integer yearend) {
        this.yearend = yearend;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public String getCreators() {
        return creators;
    }

    public void setCreators(String creators) {
        this.creators = creators;
    }

    public String getCast_series() {
        return cast_series;
    }

    public void setCast_series(String cast_series) {
        this.cast_series = cast_series;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", yearStart=" + yearstart +
                ", yearEnd=" + yearend +
                ", seasons=" + seasons +
                ", creators='" + creators + '\'' +
                ", cast='" + cast_series + '\'' +
                // ", cast=" + cast +
                '}';
    }

    // @Override
    // public String toString() {

    // return "Serie [id=" + id + ", url=" + url + ", description=" + description
    // + ", year=" + year_film
    // + ", duration=" + duration + ", director=" + director + "]";

    // }

}
