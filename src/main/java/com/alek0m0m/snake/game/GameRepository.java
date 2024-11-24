package com.alek0m0m.snake.game;

import com.Alek0m0m.library.spring.web.mvc.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends BaseRepository<Game> {
    // Additional query methods if needed
}