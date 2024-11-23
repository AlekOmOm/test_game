package com.alek0m0m.snake.food;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;

public class FoodMapper extends EntityToDTOMapperImpl<FoodDTOInput, FoodDTO, Food> {

    @Override
    public FoodDTO toDTO(FoodDTOInput dtoInput) {
        FoodDTO dto = new FoodDTO();
        dto.setId(dtoInput.getId());
        dto.setName(dtoInput.getName());
        dto.setEmail(dtoInput.getEmail());
        dto.setPassword(dtoInput.getPassword());
        dto.setRole(dtoInput.getRole());
        return dto;
    }

    @Override
    public Food toEntity(FoodDTO dto) {
        Food entity = new Food();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }

    @Override
    public FoodDTO toDTO(Food entity) {
        FoodDTO dto = new FoodDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

}
