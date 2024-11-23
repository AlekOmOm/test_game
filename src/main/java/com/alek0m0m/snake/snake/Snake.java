package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.jpa.BaseEntity;
import com.alek0m0m.snake.block.Block;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@Entity
@ToString
public class Snake extends BaseEntity {

    @OneToMany(mappedBy = "snake", targetEntity = Block.class, cascade = CascadeType.ALL)
    private List<Block> body;

}
