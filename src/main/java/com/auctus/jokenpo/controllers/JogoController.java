package com.auctus.jokenpo.controllers;

import com.auctus.jokenpo.models.Jogo;
import com.auctus.jokenpo.services.JogoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogo")
@Api(tags = "Jogo" )

public class JogoController {

    @Autowired
    JogoService jogoService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna jogo pelo id")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return new ResponseEntity<>(jogoService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    @ApiOperation(value = "Retorna lista com todos os jogos")
    public ResponseEntity<?> listarJogoes(){

        return new ResponseEntity<>(jogoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    @ApiOperation(value = "Salva um jogo")
    public ResponseEntity<?> adicionarJogo(Jogo jogo){

        return new ResponseEntity<>(jogoService.save(jogo), HttpStatus.CREATED);
    }



}
