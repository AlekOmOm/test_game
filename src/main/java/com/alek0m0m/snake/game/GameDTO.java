package com.alek0m0m.snake.game;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.block.Block;
import com.alek0m0m.snake.board.Board;
import com.alek0m0m.snake.user.User;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class GameDTO extends BaseEntityDTO<Game> {

    private List<User> users;

    private Board board;

    @Override
    public Game toEntity() {
        Game game = new Game();
        game.setId(this.getId());
        game.setUsers(this.users);
        game.setBoard(this.board);
    return game;
    }


}
