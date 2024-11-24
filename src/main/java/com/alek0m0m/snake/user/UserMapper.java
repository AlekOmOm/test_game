package com.alek0m0m.snake.user;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;

public class UserMapper extends EntityToDTOMapperImpl<UserDTOInput, UserDTO, User> {

    @Override
    public UserDTO toDTO(UserDTOInput dtoInput) {
        UserDTO dto = new UserDTO();
        dto.setId(dtoInput.getId());
        dto.setName(dtoInput.getName());
        dto.setPassword(dtoInput.getPassword());
        dto.setSnake(dtoInput.getSnake());
        return dto;
    }

    @Override
    public User toEntity(UserDTO dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setSnake(dto.getSnake());
        return entity;
    }

    @Override
    public UserDTO toDTO(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setSnake(entity.getSnake());
        return dto;
    }

}
