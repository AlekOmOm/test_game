package com.alek0m0m.snake.board;

import com.Alek0m0m.library.jpa.EntityToDTOMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class BoardMapper extends EntityToDTOMapperImpl<BoardDTOInput, BoardDTO, Board> {

    @Override
    public Board toEntity(BoardDTO boardDTO) {
        Board board = new Board();
        board.setBlocks(boardDTO.getBlocks());
        return board;
    }

    @Override
    public BoardDTO toDTO(BoardDTOInput boardDTOInput) {
        return null;
    }


    @Override
    public BoardDTO toDTO(Board board) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(board.getId());
        boardDTO.setBlocks(board.getBlocks());
        return boardDTO;
    }

}
