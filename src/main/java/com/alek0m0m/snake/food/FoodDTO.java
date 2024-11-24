package com.alek0m0m.snake.food;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.block.Block;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodDTO extends BaseEntityDTO<Food> {

    private Block block;

    @Override
    public Food toEntity() {
        Food food = new Food();
        food.setId(this.getId());
        food.setBlock(this.block);
        return food;
    }

}
