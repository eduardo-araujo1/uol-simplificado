package com.eduardo.uolsimplificado.controller;

import com.eduardo.uolsimplificado.model.Player;
import com.eduardo.uolsimplificado.model.dtos.PlayerDto;
import com.eduardo.uolsimplificado.service.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService service;
    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
        Player newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }
}
