package com.auctus.jokenpo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Jogo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Rodada> rodadas;

    @OneToOne
    private Jogador jogadorVencedorJogo;


    public Jogador getJogadorVencedorJogo() {
        return jogadorVencedorJogo;
    }

    public void setJogadorVencedorJogo(Jogador jogadorVencedorJogo) {
        this.jogadorVencedorJogo = jogadorVencedorJogo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<Rodada> rodadas) {
        this.rodadas = rodadas;
    }
}
