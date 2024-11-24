package com.alek0m0m.snake.game;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class GameMapper extends EntityToDTOMapperImpl<GameDTOInput, GameDTO, Game> {

    @Override
    public Game toEntity(GameDTO gameDTO) {
        Game game = new Game();
        game.setBlocks(gameDTO.getBlocks());
        return game;
    }

    @Override
    public GameDTO toDTO(GameDTOInput gameDTOInput) {
        return null;
    }


    @Override
    public GameDTO toDTO(Game game) {
        GameDTO gameDTO = new GameDTO();
        gameDTO.setId(game.getId());
        gameDTO.setBlocks(game.getBlocks());
        return gameDTO;
    }

}
