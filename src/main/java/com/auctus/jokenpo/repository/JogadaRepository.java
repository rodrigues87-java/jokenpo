package com.auctus.jokenpo.repository;

import com.auctus.jokenpo.models.Jogada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface JogadaRepository extends JpaRepository<Jogada, Long> {
    Jogada findJogadaById(Long id);
}