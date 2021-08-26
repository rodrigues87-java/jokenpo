package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.*;
import com.auctus.jokenpo.repository.RegrasRepository;
import com.auctus.jokenpo.repository.RodadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodadaService {

    @Autowired
    RodadaRepository rodadaRepository;

    @Autowired
    RegrasRepository regrasRepository;


    public List<Rodada> findAll(){
        return rodadaRepository.findAll();
    }

    public Rodada save(Rodada rodada) {

        List<Entrada> entradas = rodada.getEntradas();

        if(entradas.size() <2){
            throw new RuntimeException("É necessário ter pelo menos 2 entradas");
        }



        for (int i=0; i < entradas.size(); i++){

            for(int j= 0; j < entradas.size(); j++){

                if(j>i){
                    System.out.println(entradas.get(i).getId() + " e " + entradas.get(j).getId());

                    Regras regras = regrasRepository.findRegrasByJogadaOfencoraAndJogadaDefencora(entradas.get(i).getJogada(), entradas.get(j).getJogada());

                    if(regras.getVitoria_ofencora()){
                        entradas.get(i).adicionarVitoria();
                    }
                    else {
                        entradas.get(j).adicionarVitoria();
                    }

                }

            }

        }



        System.out.println("");


        return rodadaRepository.save(rodada);
    }


    public Rodada findById(Long id){

        Rodada rodada = rodadaRepository.findRodadaById(id);

        if (rodada == null){
            throw new RuntimeException("rodada não encontrada");
        }

        return rodada;
    }



}
