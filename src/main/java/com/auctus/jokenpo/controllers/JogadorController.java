package com.auctus.jokenpo.controllers;

import com.auctus.jokenpo.models.Jogador;
import com.auctus.jokenpo.services.JogadorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
@Api(tags = "Jogador" )

public class JogadorController {

    @Autowired
    JogadorService jogadorService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna jogador pelo id")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return new ResponseEntity<>(jogadorService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    @ApiOperation(value = "Retorna lista com todos os jogadores")
    public ResponseEntity<?> listarJogadores(){

        return new ResponseEntity<>(jogadorService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    @ApiOperation(value = "Salva um jogador")
    public ResponseEntity<?> adicionarJogador(Jogador jogador){

        return new ResponseEntity<>(jogadorService.save(jogador), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Edita um jogador")
    public ResponseEntity<?> editarJogador(Jogador jogador){

        return new ResponseEntity<>(jogadorService.save(jogador), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta jogador pelo id")
    public ResponseEntity<?> deletarJogador(@PathVariable(value = "id") Long id){
        jogadorService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
