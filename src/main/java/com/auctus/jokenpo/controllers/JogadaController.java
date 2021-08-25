package com.auctus.jokenpo.controllers;

import com.auctus.jokenpo.models.Jogada;
import com.auctus.jokenpo.services.JogadaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogada")
@Api(tags = "Jogada" )

public class JogadaController {

    @Autowired
    JogadaService jogadaService;

    @GetMapping("/")
    @ApiOperation(value = "Retorna lista com todas as jogadas")
    public ResponseEntity<?> listarJogadas(){

        return new ResponseEntity<>(jogadaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna jogada pelo id")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return new ResponseEntity<>(jogadaService.findById(id), HttpStatus.OK);
    }


}
