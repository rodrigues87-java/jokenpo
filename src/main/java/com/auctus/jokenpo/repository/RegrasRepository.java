package com.auctus.jokenpo.repository;

import com.auctus.jokenpo.models.Jogada;
import com.auctus.jokenpo.models.Regras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegrasRepository extends JpaRepository<Regras, Long> {
    Regras findRegrasByJogadaOfencoraAndJogadaDefencora(Jogada jogadaOfencora, Jogada jogadaDefencora);
}