package com.alek0m0m.snake.board;

import com.alek0m0m.snake.block.Block;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTOInput {

    private long id;
    private Block[][] blocks;

}
