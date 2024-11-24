package com.alek0m0m.snake.game;

import com.Alek0m0m.library.jpa.BaseEntity;
import com.alek0m0m.snake.block.Block;
import com.alek0m0m.snake.board.Board;
import com.alek0m0m.snake.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@Entity
public class Game extends BaseEntity {

    @OneToMany
    private List<User> users;

    @OneToOne
    private Board board;



}
