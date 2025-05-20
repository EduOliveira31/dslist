package com.eduardooliveira.dslist.services;

import com.eduardooliveira.dslist.dto.GameDTO;
import com.eduardooliveira.dslist.dto.GameListDTO;
import com.eduardooliveira.dslist.dto.GameMinDTO;
import com.eduardooliveira.dslist.entities.Game;
import com.eduardooliveira.dslist.entities.GameList;
import com.eduardooliveira.dslist.repositories.GameListRepository;
import com.eduardooliveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
