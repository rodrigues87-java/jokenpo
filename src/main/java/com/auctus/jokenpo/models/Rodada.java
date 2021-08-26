package com.auctus.jokenpo.models;

import com.auctus.jokenpo.services.JogadaService;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Rodada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    List<Entrada> entradas;

    @OneToMany
    private List<Jogador> jogadoresVitoriososRodada;

    public List<Jogador> getJogadoresVitoriososRodada() {
        return jogadoresVitoriososRodada;
    }

    public void setJogadoresVitoriososRodada(List<Jogador> jogadoresVitoriososRodada) {
        this.jogadoresVitoriososRodada = jogadoresVitoriososRodada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
}
