package com.alek0m0m.snake.block;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BlockDTO extends BaseEntityDTO<Block> {

    private int x;
    private int y;


    @Override
    public Block toEntity() {
        Block block = new Block();
        block.setId(this.getId());
        block.setX(this.x);
        block.setY(this.y);
        return null;
    }

}
