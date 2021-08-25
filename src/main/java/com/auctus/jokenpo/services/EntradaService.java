package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.repository.EntradaRepository;
import com.auctus.jokenpo.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaService {

    @Autowired
    EntradaRepository entradaRepository;

    public List<Entrada> findAll(){
        return entradaRepository.findAll();
    }

    public Entrada save(Entrada entrada) {
        if(entrada.getJogada() == null){
            throw new RuntimeException("Jogada nao pode ser nula");
        }
        if(entrada.getJogador() == null){
            throw new RuntimeException("Jogador nao pode ser nulo");
        }
        return entradaRepository.save(entrada);
    }

    public void delete(Long id) {
        Entrada entradaEncontrada = findById(id);
        entradaRepository.delete(entradaEncontrada);
    }

    public Entrada editar(Long id, Entrada entrada) {
        Entrada entradaEncontrada =  findById(id);
        entradaEncontrada.setJogada(entrada.getJogada());
        entradaEncontrada.setJogador(entrada.getJogador());

        return save(entradaEncontrada);
    }

    public Entrada findById(Long id){

        Entrada Entrada = entradaRepository.findEntradaById(id);

        if (Entrada == null){
            throw new RuntimeException("Entrada não encontrada");
        }

        return Entrada;
    }

}
