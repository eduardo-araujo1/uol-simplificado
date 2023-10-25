package com.eduardo.uolsimplificado.service;

import com.eduardo.uolsimplificado.model.Player;
import com.eduardo.uolsimplificado.model.dtos.PlayerDto;
import com.eduardo.uolsimplificado.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class PlayerService {

    private final PlayerRepository repository;
    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
