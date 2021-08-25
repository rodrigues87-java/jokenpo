package com.auctus.jokenpo.controllers;

import com.auctus.jokenpo.models.Jogador;
import com.auctus.jokenpo.repository.JogadorRepository;
import com.auctus.jokenpo.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    JogadorService jogadorService;


    @GetMapping("/")
    public List<Jogador> listarJogadores(){

        return jogadorService.findAll();
    }

    @PostMapping("/add")
    public Jogador adicionarJogador(Jogador jogador){

        return jogadorService.save(jogador);
    }

    @PutMapping("/editar/{id}")
    public Jogador editarJogador(@PathVariable(value = "id") Long id, Jogador jogador){

        return jogadorService.editar(id,jogador);

    }

    @DeleteMapping("/deletar/{id}")
    public boolean deletarJogador(@PathVariable(value = "id") Long id){
        return jogadorService.delete(id);
    }


}
