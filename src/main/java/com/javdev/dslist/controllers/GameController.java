package com.javdev.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javdev.dslist.dto.GameMinDTO;

import com.javdev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @getMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> resultado = gameService.findAll();
        return resultado;

    }

}
