package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Jogador;
import com.auctus.jokenpo.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    JogadorRepository jogadorRepository;

    public List<Jogador> findAll(){

        return jogadorRepository.findAll();
    }

    public Jogador save(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public boolean delete(Long id) {
        Jogador jogadorEncontrado =  jogadorRepository.findJogadorById(id);

        if (jogadorEncontrado ==null){
            return false;

        }

        jogadorRepository.delete(jogadorEncontrado);
        return true;
    }

    public Jogador editar(Long id, Jogador jogador) {
        Jogador jogadorEncontrado =  jogadorRepository.findJogadorById(id);

        if (jogadorEncontrado ==null){
            return null;

        }

        jogadorEncontrado.setNome(jogador.getNome());

        return jogadorRepository.save(jogadorEncontrado);
    }

    public Jogador findById(Long id){

        return jogadorRepository.findJogadorById(id);
    }

}
