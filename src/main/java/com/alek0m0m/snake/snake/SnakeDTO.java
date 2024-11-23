package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.jpa.BaseEntityDTO;

public class SnakeDTO extends BaseEntityDTO<Snake> {

    private String name;
    private String email;
    private String password;
    private String role;

    @Override
    public Snake toEntity() {
        Snake snake = new Snake();
        snake.setId(this.getId());
        snake.setName(this.name);
        snake.setEmail(this.email);
        snake.setPassword(this.password);
        snake.setRole(this.role);
        return snake;
    }

    //
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }

}
