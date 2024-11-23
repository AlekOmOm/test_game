package com.alek0m0m.snake.block;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class BlockMapper extends EntityToDTOMapperImpl<BlockDTOInput, BlockDTO, Block> {

    @Override
    public BlockDTO toDTO(BlockDTOInput dtoInput) {
        BlockDTO dto = new BlockDTO();
        dto.setId(dtoInput.getId());
        dto.setName(dtoInput.getName());
        dto.setEmail(dtoInput.getEmail());
        dto.setPassword(dtoInput.getPassword());
        dto.setRole(dtoInput.getRole());
        return dto;
    }

    @Override
    public Block toEntity(BlockDTO dto) {
        Block entity = new Block();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }

    @Override
    public BlockDTO toDTO(Block entity) {
        BlockDTO dto = new BlockDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

}
