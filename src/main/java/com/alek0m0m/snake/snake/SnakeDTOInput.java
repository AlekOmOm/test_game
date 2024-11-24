package com.alek0m0m.snake.snake;

import com.alek0m0m.snake.block.Block;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SnakeDTOInput {

    private long id;
    private List<Block> body;

}
