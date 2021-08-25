package com.auctus.jokenpo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Regras implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
