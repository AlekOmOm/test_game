package com.alek0m0m.snake.user;

import com.Alek0m0m.library.jpa.BaseEntityDTO;
import com.alek0m0m.snake.snake.Snake;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserDTO extends BaseEntityDTO<User> {

    private String name;
    private String password;
    private Snake snake;

    @Override
    public User toEntity() {
        User user = new User();
        user.setId(this.getId());
        user.setName(this.name);
        user.setPassword(this.password);
        user.setSnake(this.snake);
        return user;
    }

}
