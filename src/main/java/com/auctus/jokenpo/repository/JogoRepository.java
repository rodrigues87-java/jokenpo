package com.auctus.jokenpo.repository;


import com.auctus.jokenpo.models.Jogo;
import com.auctus.jokenpo.models.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo,Long> {
    Jogo findJogoById(Long id);
}
