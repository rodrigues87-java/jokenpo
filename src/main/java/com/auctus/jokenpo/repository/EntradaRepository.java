package com.auctus.jokenpo.repository;

import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.models.Jogada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {

    Entrada findEntradaById(Long id);
}