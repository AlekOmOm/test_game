package com.alek0m0m.snake.block;

import com.Alek0m0m.library.jpa.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Block extends BaseEntity {

    private int x;
    private int y;

}
