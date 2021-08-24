package com.auctus.jokenpo.repository;


import com.auctus.jokenpo.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador,Long> {
    Jogador findJogadorById(Long id);
}
