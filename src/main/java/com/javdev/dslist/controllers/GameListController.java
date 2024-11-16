package com.javdev.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javdev.dslist.dto.GameListDTO;
import com.javdev.dslist.dto.GameMinDTO;
import com.javdev.dslist.services.GameListService;
import com.javdev.dslist.services.GameService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    
    
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;

    }

     @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findList( Long listId) {
        return gameService.findBylist(listId);

    }



}
