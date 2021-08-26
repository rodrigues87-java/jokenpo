package com.auctus.jokenpo.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
public class Jogador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Rodada rodada;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
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
}