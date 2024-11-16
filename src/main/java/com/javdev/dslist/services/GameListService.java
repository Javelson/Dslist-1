package com.javdev.dslist.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.javdev.dslist.dto.GameListDTO;
import com.javdev.dslist.entities.GameList;
import com.javdev.dslist.repositories.GameListRepositoy;

@Service
public class GameListService {

    @Autowired
    private GameListRepositoy gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
       List<GameList> resultado = gameListRepository.findAll();
       List<GameListDTO> dto = resultado.stream().map(x-> new GameListDTO(x)).toList();
       return dto;
    }
}
