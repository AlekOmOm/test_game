package com.alek0m0m.snake.game;

import com.Alek0m0m.library.spring.web.mvc.BaseRESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/board")
public class GameController extends BaseRESTController<GameDTOInput, GameDTO, Game, GameMapper, GameService, GameRepository> {

    @Autowired
    public GameController(GameService service) {
        super(service);
    }


}
