package com.auctus.jokenpo.controllers;

import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.services.EntradaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrada")
@Api(tags = "Entrada" )

public class EntradaController {

    @Autowired
    EntradaService entradaService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna entrada pelo id")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return new ResponseEntity<>(entradaService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    @ApiOperation(value = "Retorna lista com todas as entradas")
    public ResponseEntity<?> listarEntradas(){

        return new ResponseEntity<>(entradaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    @ApiOperation(value = "Salva um entrada")
    public ResponseEntity<?> adicionarEntrada(Entrada entrada){

        return new ResponseEntity<>(entradaService.save(entrada), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Edita uma entrada")
    public ResponseEntity<?> editarEntrada(Entrada entrada){

        return new ResponseEntity<>(entradaService.save(entrada), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta entrada pelo id")
    public ResponseEntity<?> deletarEntrada(@PathVariable(value = "id") Long id){
        entradaService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
