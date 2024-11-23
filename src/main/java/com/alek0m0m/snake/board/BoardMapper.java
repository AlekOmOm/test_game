package com.alek0m0m.snake.board;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class BoardMapper extends EntityToDTOMapperImpl<BoardDTOInput, BoardDTO, Board> {

    @Override
    public BoardDTO toDTO(BoardDTOInput dtoInput) {
        BoardDTO dto = new BoardDTO();
        dto.setId(dtoInput.getId());
        dto.setName(dtoInput.getName());
        dto.setEmail(dtoInput.getEmail());
        dto.setPassword(dtoInput.getPassword());
        dto.setRole(dtoInput.getRole());
        return dto;
    }

    @Override
    public Board toEntity(BoardDTO dto) {
        Board entity = new Board();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }

    @Override
    public BoardDTO toDTO(Board entity) {
        BoardDTO dto = new BoardDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

}
