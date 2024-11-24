package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.block.Block;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SnakeDTO extends BaseEntityDTO<Snake> {

    private List<Block> body;

    @Override
    public Snake toEntity() {
        Snake snake = new Snake();
        snake.setId(getId());
        snake.setBody(body);
        return snake;
    }

}
