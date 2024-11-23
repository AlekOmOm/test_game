package com.alek0m0m.snake.block;

import com.Alek0m0m.library.spring.web.mvc.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends BaseRepository<Block> {
    // Additional query methods if needed
}