package com.alek0m0m.snake.food;

import com.Alek0m0m.library.jpa.BaseEntityDTO;

public class FoodDTO extends BaseEntityDTO<Food> {

    private String name;
    private String email;
    private String password;
    private String role;

    @Override
    public Food toEntity() {
        Food user = new Food();
        user.setId(this.getId());
        user.setName(this.name);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setRole(this.role);
        return user;
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
