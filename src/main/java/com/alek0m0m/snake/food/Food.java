package com.alek0m0m.snake.food;

import com.Alek0m0m.library.jpa.BaseEntity;
import com.alek0m0m.snake.block.Block;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Food extends BaseEntity {

    @OneToOne(mappedBy = "food", targetEntity = Block.class, cascade = CascadeType.ALL)
    private Block block;

}
