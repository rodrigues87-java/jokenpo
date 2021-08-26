package com.auctus.jokenpo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Entrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Jogada jogada;

    @OneToOne
    private Jogador jogador;

    @ManyToOne
    private Rodada rodada;


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

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
