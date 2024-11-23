package com.alek0m0m.snake.board;

import com.Alek0m0m.library.spring.web.mvc.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService extends BaseService<BoardDTOInput, BoardDTO, Board, BoardMapper, BoardRepository> {

    @Autowired
    public BoardService(BoardRepository repository, BoardMapper mapper) {
        super(repository, mapper);
    }

}