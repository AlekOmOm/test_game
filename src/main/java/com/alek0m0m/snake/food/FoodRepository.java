package com.alek0m0m.snake.food;

import com.Alek0m0m.library.spring.web.mvc.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends BaseRepository<Food> {
    // Additional query methods if needed
}