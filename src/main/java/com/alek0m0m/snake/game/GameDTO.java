package com.alek0m0m.snake.game;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.block.Block;
import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class GameDTO extends BaseEntityDTO<Game> {

    private Block[][] blocks;

    @Override
    public Game toEntity() {
        Game game = new Game();
        game.setId(this.getId());
        game.setBlocks(this.blocks);
        return game;
    }


}
