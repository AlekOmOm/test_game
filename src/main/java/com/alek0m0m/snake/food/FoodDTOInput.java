package com.alek0m0m.snake.food;

import com.alek0m0m.snake.block.Block;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodDTOInput {
    private Long id;
    private Block block;

}
