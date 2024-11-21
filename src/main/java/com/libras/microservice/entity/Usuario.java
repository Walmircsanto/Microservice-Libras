package com.libras.microservice.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(nullable = false)
    private String nome;
    @NotNull    @Column(nullable = false)
    private String login;

    @OneToMany(mappedBy = "sugeriu", cascade = CascadeType.ALL)
    private List<LibrasEntity> librasEntities = new ArrayList<>();


    public Usuario() {
    }

    public Usuario(Long id, String nome, String login) {
        this.id = id;
        this.nome = nome;
        this.login = login;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<LibrasEntity> getLibrasEntities() {
        return librasEntities;
    }

    public void setLibrasEntities(List<LibrasEntity> librasEntities) {
        this.librasEntities = librasEntities;
    }
}
