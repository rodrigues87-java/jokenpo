package com.auctus.jokenpo.models;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Regras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(readOnly = true)
    private Long id;

    @ManyToOne
    private Jogada jogadaOfencora;

    @ManyToOne
    private Jogada jogadaDefencora;

    private boolean vitoria_ofencora;

    public Regras(Jogada jogadaOfencora, Jogada jogadaDefencora) {
        this.jogadaOfencora = jogadaOfencora;
        this.jogadaDefencora = jogadaDefencora;
    }

    public Regras() {

    }


    public Jogada getJogadaOfencora() {
        return jogadaOfencora;
    }

    public void setJogadaOfencora(Jogada jogadaOfencora) {
        this.jogadaOfencora = jogadaOfencora;
    }

    public Jogada getJogadaDefencora() {
        return jogadaDefencora;
    }

    public void setJogadaDefencora(Jogada jogadaDefencora) {
        this.jogadaDefencora = jogadaDefencora;
    }

    public boolean getVitoria_ofencora() {
        return vitoria_ofencora;
    }

    public void setVitoria_ofencora(boolean vitoria_ofencora) {
        this.vitoria_ofencora = vitoria_ofencora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
