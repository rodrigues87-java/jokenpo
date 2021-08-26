package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.models.Rodada;
import com.auctus.jokenpo.repository.RodadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodadaService {

    @Autowired
    RodadaRepository rodadaRepository;

    public List<Rodada> findAll(){
        return rodadaRepository.findAll();
    }

    public Rodada save(Rodada rodada) {

        List<Entrada> entradas = rodada.getEntradas();

        if(entradas.size() <2){
            throw new RuntimeException("É necessário ter pelo menos 2 jogadores");
        }


        return rodadaRepository.save(rodada);
    }


    public Rodada findById(Long id){

        Rodada rodada = rodadaRepository.findRodadaById(id);

        if (rodada == null){
            throw new RuntimeException("rodada não encontrado");
        }

        return rodada;
    }

}
