package com.alek0m0m.snake.board;

import com.Alek0m0m.library.spring.web.mvc.BaseRESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/board")
public class BoardController extends BaseRESTController<BoardDTOInput, BoardDTO, Board, BoardMapper, BoardService, BoardRepository> {

    @Autowired
    public BoardController(BoardService service) {
        super(service);
    }


}
