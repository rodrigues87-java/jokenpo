package com.auctus.jokenpo.services;

import com.auctus.jokenpo.models.Jogador;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@SpringBootTest
class JogadorServiceTest {

    @MockBean
    private JogadorService jogadorService;


    @Test
    public void testASave() {
        Jogador jogador1 = new Jogador("Pedro");
        doReturn(jogador1).when(jogadorService).save(any());

        Jogador jogadorRetorno = jogadorService.save(jogador1);

        assertEquals(jogador1, jogadorRetorno);
    }

    @Test
    public void testBFindById() {

        Jogador jogador = new Jogador(1L, "Pedro");
        doReturn(jogador).when(jogadorService).findById(1L);

        Jogador jogadorEncontrado = jogadorService.findById(1L);

        assertEquals(jogadorEncontrado, jogador);

    }

    @Test
    void testCFindAll() {
        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador1 = new Jogador("Pedro");
        jogadores.add(jogador1);

        doReturn(jogadores).when(jogadorService).findAll();

        List<Jogador> jogadorRetorno = jogadorService.findAll();

        assertEquals(jogadores, jogadorRetorno);

    }


    @Test
    void testDEditar() {
        Jogador jogador = new Jogador(1L, "Paulo");
        doReturn(jogador).when(jogadorService).editar(1L, jogador);

        Jogador jogadorResposta = jogadorService.editar(1L, jogador);
        assertEquals(jogador, jogadorResposta);

    }


    @Test
    void testEDelete() {
        Jogador person = new Jogador(1L, "paulo");

        when(jogadorService.delete(1L)).thenReturn(true);

        boolean resposta = jogadorService.delete(person.getId());

        assertTrue(resposta);
    }


}