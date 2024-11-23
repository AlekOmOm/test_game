package com.alek0m0m.snake.user;

import com.Alek0m0m.library.jpa.BaseEntity;
import com.alek0m0m.snake.snake.Snake;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
public class User extends BaseEntity {

    private String name;
    private String password;

    @OneToOne(mappedBy = "user", targetEntity = Snake.class, cascade = CascadeType.ALL)
    private Snake snake;

}
