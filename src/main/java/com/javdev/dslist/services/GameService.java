package com.javdev.dslist.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javdev.dslist.dto.GameMinDTO;
import com.javdev.dslist.entities.Game;
import com.javdev.dslist.repositories.GameRepositoy;
@Service
public class GameService {

    @Autowired
    private GameRepositoy gameRepository;
    
    public List<GameMinDTO> findAll() {
       List<Game> resultado = gameRepository.findAll();
       List<GameMinDTO> dto = resultado.stream().map(x-> new GameMinDTO(x)).toList();
       return dto;
    }
}
