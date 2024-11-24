package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class SnakeMapper extends EntityToDTOMapperImpl<SnakeDTOInput, SnakeDTO, Snake> {

    @Override
    public SnakeDTO toDTO(SnakeDTOInput dtoInput) {
        SnakeDTO dto = new SnakeDTO();
        dto.setId(dtoInput.getId());
        dto.setBody(dtoInput.getBody());
        return dto;
    }

    @Override
    public Snake toEntity(SnakeDTO dto) {
        Snake entity = new Snake();
        entity.setId(dto.getId());
        entity.setBody(dto.getBody());
        return entity;
    }

    @Override
    public SnakeDTO toDTO(Snake entity) {
        SnakeDTO dto = new SnakeDTO();
        dto.setId(entity.getId());
        dto.setBody(entity.getBody());
        return dto;
    }

}
