package com.javdev.dslist.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javdev.dslist.dto.GameDTO;
import com.javdev.dslist.dto.GameMinDTO;
import com.javdev.dslist.entities.Game;
import com.javdev.dslist.projection.GameMinProjetion;
import com.javdev.dslist.repositories.GameRepositoy;
@Service
public class GameService {

    @Autowired
    private GameRepositoy gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
       List<Game> resultado = gameRepository.findAll();
       List<GameMinDTO> dto = resultado.stream().map(x-> new GameMinDTO(x)).toList();
       return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findBylist(Long listId) {
       List<GameMinProjetion>resultado = gameRepository.searchByList(listId);
       List<GameMinDTO> dto = resultado.stream().map(x-> new GameMinDTO(x)).toList();
       return dto;
    }
}
