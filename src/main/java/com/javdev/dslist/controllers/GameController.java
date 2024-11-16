package com.javdev.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javdev.dslist.dto.GameDTO;
import com.javdev.dslist.dto.GameMinDTO;

import com.javdev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
      GameDTO result = gameService.findById(id);
      return result;

    }
    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();

    }


}
