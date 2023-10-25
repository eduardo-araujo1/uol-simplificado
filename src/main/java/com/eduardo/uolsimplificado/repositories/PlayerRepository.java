package com.eduardo.uolsimplificado.repositories;

import com.eduardo.uolsimplificado.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
