package com.alek0m0m.snake.game;

import com.Alek0m0m.library.spring.web.mvc.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService extends BaseService<GameDTOInput, GameDTO, Game, GameMapper, GameRepository> {

    @Autowired
    public GameService(GameRepository repository, GameMapper mapper) {
        super(repository, mapper);
    }

}