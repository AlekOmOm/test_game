package com.alek0m0m.snake.board;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.block.Block;
import jakarta.persistence.Entity;
import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BoardDTO extends BaseEntityDTO<Board> {

    private Block[][] blocks;

    @Override
    public Board toEntity() {
        Board board = new Board();
        board.setId(this.getId());
        board.setBlocks(this.blocks);
        return board;
    }


}
