package com.alek0m0m.snake.board;

import com.Alek0m0m.library.jpa.BaseEntity;
import com.alek0m0m.snake.block.Block;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Board extends BaseEntity {

    private Block[][] blocks;

    private final int WIDTH = 50;
    private final int HEIGHT = 50;

}
