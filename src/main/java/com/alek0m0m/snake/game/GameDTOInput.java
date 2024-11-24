package com.alek0m0m.snake.game;

import com.alek0m0m.snake.block.Block;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GameDTOInput {

    private long id;
    private Block[][] blocks;

}
