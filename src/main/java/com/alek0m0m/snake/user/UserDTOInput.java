package com.alek0m0m.snake.user;

import com.alek0m0m.snake.snake.Snake;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserDTOInput {

    private long id;

    private String name;
    private String password;

    private Snake snake;
}
