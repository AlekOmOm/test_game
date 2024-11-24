package com.alek0m0m.snake.game;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class GameMapper extends EntityToDTOMapperImpl<GameDTOInput, GameDTO, Game> {

    @Override
    public Game toEntity(GameDTO gameDTO) {
        Game game = new Game();
        if (gameDTO.getId() != 0) {game.setId(gameDTO.getId());}
        game.setUsers(gameDTO.getUsers());
        game.setBoard(gameDTO.getBoard());
        return game;
    }

    @Override
    public GameDTO toDTO(GameDTOInput gameDTOInput) {
        GameDTO gameDTO = new GameDTO();
        if (gameDTO.getId() != 0) {gameDTO.setId(gameDTOInput.getId());}
        gameDTO.setUsers(gameDTOInput.getUsers());
        gameDTO.setBoard(gameDTOInput.getBoard());
        return gameDTO;
    }

    @Override
    public GameDTO toDTO(Game game) {
        GameDTO gameDTO = new GameDTO();
        if (game.getId() != 0) {gameDTO.setId(game.getId());}
        gameDTO.setUsers(game.getUsers());
        gameDTO.setBoard(game.getBoard());
        return gameDTO;
    }

}
