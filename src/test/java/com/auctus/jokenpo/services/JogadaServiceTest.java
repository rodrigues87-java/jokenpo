package com.auctus.jokenpo.services;

import com.auctus.jokenpo.models.Jogada;
import com.auctus.jokenpo.models.Jogada;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class JogadaServiceTest {

    @MockBean
    JogadaService jogadaService;

    @Test
    void findAll() {
        List<Jogada> jogadas = new ArrayList<>();
        Jogada jogada1 = new Jogada(1L,"papel");
        Jogada jogada2 = new Jogada(2L,"tesoura");

        jogadas.add(jogada1);
        jogadas.add(jogada2);

        doReturn(jogadas).when(jogadaService).findAll();

        List<Jogada> jogadaRetorno = jogadaService.findAll();

        assertEquals(jogadas, jogadaRetorno);
    }

    @Test
    void findById() {
        Jogada jogada = new Jogada(1L, "aranha");
        doReturn(jogada).when(jogadaService).findById(1L);

        Jogada jogadaEncontrada = jogadaService.findById(1L);

        assertEquals(jogadaEncontrada, jogada);

    }
}