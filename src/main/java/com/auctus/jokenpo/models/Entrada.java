package com.auctus.jokenpo.models;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Value;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Entrada  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(readOnly = true)
    private Long id;

    @OneToOne
    private Jogada jogada;

    @OneToOne
    private Jogador jogador;



    @Value("${props.isFPL:true}")
    private Long quantidadeDeVitorias=0L;

    public Long getQuantidadeDeVitorias() {
        return quantidadeDeVitorias;
    }

    public void setQuantidadeDeVitorias(Long quantidadeDeVitorias) {
        this.quantidadeDeVitorias = quantidadeDeVitorias;
    }

    public void adicionarVitoria(){
        this.quantidadeDeVitorias = this.quantidadeDeVitorias +1;
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
