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
        if(jogador.getNome() == null){
            throw new RuntimeException("O nome do jogador não pode ser vazio");

        }
        return jogadorRepository.save(jogador);
    }

    public void delete(Long id) {
        Jogador jogadorEncontrado = findById(id);
        jogadorRepository.delete(jogadorEncontrado);
    }

    public Jogador editar(Long id, Jogador jogador) {
        Jogador jogadorEncontrado =  findById(id);
        jogadorEncontrado.setNome(jogador.getNome());
        return save(jogadorEncontrado);
    }

    public Jogador findById(Long id){

        Jogador jogador = jogadorRepository.findJogadorById(id);

        if (jogador == null){
            throw new RuntimeException("jogador não encontrado");
        }

        return jogador;
    }

}
