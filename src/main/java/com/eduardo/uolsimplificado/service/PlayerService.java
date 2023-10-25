package com.eduardo.uolsimplificado.service;

import com.eduardo.uolsimplificado.infra.CodinameHandler;
import com.eduardo.uolsimplificado.model.GroupType;
import com.eduardo.uolsimplificado.model.Player;
import com.eduardo.uolsimplificado.model.dtos.PlayerDto;
import com.eduardo.uolsimplificado.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PlayerService {

    private final PlayerRepository repository;
    private final CodinameHandler handler;
    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
