package com.alek0m0m.snake.board;

import com.Alek0m0m.library.spring.web.mvc.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends BaseRepository<Board> {
    // Additional query methods if needed
}