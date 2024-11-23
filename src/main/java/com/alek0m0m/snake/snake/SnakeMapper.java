package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;

public class SnakeMapper extends EntityToDTOMapperImpl<SnakeDTOInput, SnakeDTO, Snake> {

    @Override
    public SnakeDTO toDTO(SnakeDTOInput dtoInput) {
        SnakeDTO dto = new SnakeDTO();
        dto.setId(dtoInput.getId());
        dto.setName(dtoInput.getName());
        dto.setEmail(dtoInput.getEmail());
        dto.setPassword(dtoInput.getPassword());
        dto.setRole(dtoInput.getRole());
        return dto;
    }

    @Override
    public Snake toEntity(SnakeDTO dto) {
        Snake entity = new Snake();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }

    @Override
    public SnakeDTO toDTO(Snake entity) {
        SnakeDTO dto = new SnakeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

}
