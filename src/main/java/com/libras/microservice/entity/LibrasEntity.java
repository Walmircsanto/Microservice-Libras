package com.libras.microservice.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "libras")
public class LibrasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String palavra;
    private String descricao;
    private String url;
    private String video;
    private String foto;
    private String justificativa;


    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = true)
    private Usuario sugeriu;

    public LibrasEntity() {
    }

    public LibrasEntity(Long id, String palavra, String descricao, String url, String video, String foto, String justificativa) {
        this.id = id;
        this.palavra = palavra;
        this.descricao = descricao;
        this.url = url;
        this.video = video;
        this.foto = foto;
        this.justificativa = justificativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Usuario getSugeriu() {
        return sugeriu;
    }

    public void setSugeriu(Usuario sugeriu) {
        this.sugeriu = sugeriu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibrasEntity that = (LibrasEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(palavra, that.palavra) && Objects.equals(descricao, that.descricao) && Objects.equals(url, that.url) && Objects.equals(video, that.video) && Objects.equals(foto, that.foto) && Objects.equals(justificativa, that.justificativa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, palavra, descricao, url, video, foto, justificativa);
    }

    @Override
    public String toString() {
        return "LibrasEntity{" +
                "id=" + id +
                ", palavra='" + palavra + '\'' +
                ", descricao='" + descricao + '\'' +
                ", url='" + url + '\'' +
                ", video='" + video + '\'' +
                ", foto='" + foto + '\'' +
                ", justificativa='" + justificativa + '\'' +
                '}';
    }
}
