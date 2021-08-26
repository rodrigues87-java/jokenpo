package com.auctus.jokenpo.repository;

import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.models.Rodada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RodadaRepository extends JpaRepository<Rodada, Long> {
    Rodada findRodadaById(Long id);
}