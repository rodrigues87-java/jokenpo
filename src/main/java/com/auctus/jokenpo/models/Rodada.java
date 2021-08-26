package com.auctus.jokenpo.models;

import com.auctus.jokenpo.services.JogadaService;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(readOnly = true)
    private Long id;

    @OneToMany
    List<Entrada> entradas;

    @OneToMany
    private List<Jogador> jogadoresVitoriososRodada;

    private String resultadoRodada;


    public void findJogadoresVitoriosos(){

        Comparator<Entrada> compareById = (Entrada o1, Entrada o2) -> o1.getQuantidadeDeVitorias().compareTo( o2.getQuantidadeDeVitorias() );

        entradas.sort(compareById.reversed());

        jogadoresVitoriososRodada = new ArrayList<Jogador>();
        this.jogadoresVitoriososRodada.add(entradas.get(0).getJogador());

        for (int i=0; i < entradas.size() -1; i++){
            if(entradas.get(i).getQuantidadeDeVitorias().equals(entradas.get(i + 1).getQuantidadeDeVitorias())){
                this.jogadoresVitoriososRodada.add(entradas.get(i+1).getJogador());
            }
            else{
                break;
            }
        }


    }

    public List<Jogador> getJogadoresVitoriososRodada() {
        return jogadoresVitoriososRodada;
    }

    public void setJogadoresVitoriososRodada(List<Jogador> jogadoresVitoriososRodada) {
        this.jogadoresVitoriososRodada = jogadoresVitoriososRodada;
    }

    public String getResultadoRodada() {
        return resultadoRodada;
    }

    public void setResultadoRodada(String resultadoRodada) {
        this.resultadoRodada = resultadoRodada;
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
