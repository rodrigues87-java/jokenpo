package com.auctus.jokenpo.services;

import com.auctus.jokenpo.models.Jogador;
import com.auctus.jokenpo.repository.JogadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class JogadorServiceTest {

    @MockBean private JogadorService jogadorService;


    @Test
    void save() {
        Jogador jogador1 = new Jogador("Pedro");
        doReturn(jogador1).when(jogadorService).save(any());

        Jogador jogadorRetorno = jogadorService.save(jogador1);

        assertEquals(jogador1,jogadorRetorno);
    }

    @Test
    void findAll() {
        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador1 = new Jogador("Pedro");
        jogadores.add(jogador1);

        doReturn(jogadores).when(jogadorService).findAll();

        List<Jogador> jogadorRetorno = jogadorService.findAll();

        assertEquals(jogadores,jogadorRetorno);

    }


    @Test
    void delete() {
    }

    @Test
    void editar() {
    }

    @Test
    public void testFindById(){

        Jogador jogador = new Jogador(1L,"Pedro");
        doReturn(jogador).when(jogadorService).findById(1L);

        Jogador jogadorEncontrado  = jogadorService.findById(1L);

        assertEquals(jogadorEncontrado,jogador);

    }
}