package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Jogo;
import com.auctus.jokenpo.models.Jogo;
import com.auctus.jokenpo.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    JogoRepository jogoRepository;

    public List<Jogo> findAll(){
        return jogoRepository.findAll();
    }

    public Jogo findById(Long id){

        Jogo jogo = jogoRepository.findJogoById(id);

        if (jogo == null){
            throw new RuntimeException("jogo não encontrado");
        }

        return jogo;
    }

    public Jogo save(Jogo jogador) {

        return jogoRepository.save(jogador);
    }

}
