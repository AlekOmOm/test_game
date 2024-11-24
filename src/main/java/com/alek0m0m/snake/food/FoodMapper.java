package com.alek0m0m.snake.food;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;

public class FoodMapper extends EntityToDTOMapperImpl<FoodDTOInput, FoodDTO, Food> {

    @Override
    public FoodDTO toDTO(FoodDTOInput dtoInput) {
        FoodDTO dto = new FoodDTO();
        dto.setId(dtoInput.getId());
        return dto;
    }

    @Override
    public Food toEntity(FoodDTO dto) {
        Food entity = new Food();
        entity.setId(dto.getId());
        entity.setBlock(dto.getBlock());
        return entity;
    }

    @Override
    public FoodDTO toDTO(Food entity) {
        FoodDTO dto = new FoodDTO();
        dto.setId(entity.getId());
        dto.setBlock(entity.getBlock());
        return dto;
    }

}
