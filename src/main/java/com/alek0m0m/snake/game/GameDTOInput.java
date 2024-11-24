package com.alek0m0m.snake.game;

import com.alek0m0m.snake.block.Block;
import com.alek0m0m.snake.board.Board;
import com.alek0m0m.snake.user.User;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GameDTOInput {

    private long id;
    private List<User> users;
    private Board board;

}
