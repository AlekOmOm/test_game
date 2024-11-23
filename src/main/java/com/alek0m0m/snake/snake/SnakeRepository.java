package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.spring.web.mvc.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnakeRepository extends BaseRepository<Snake> {
    // Additional query methods if needed
}