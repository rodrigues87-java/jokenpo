package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Jogada;
import com.auctus.jokenpo.repository.JogadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadaService {

    @Autowired
    JogadaRepository jogadaRepository;

    public List<Jogada> findAll(){
        return jogadaRepository.findAll();
    }

    public Jogada findById(Long id){

        Jogada jogador = jogadaRepository.findJogadaById(id);

        if (jogador == null){
            throw new RuntimeException("jogador não encontrado");
        }

        return jogador;
    }


}
