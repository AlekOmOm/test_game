package com.alek0m0m.snake.food;

import com.Alek0m0m.library.spring.web.mvc.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService extends BaseService<FoodDTOInput, FoodDTO, Food, FoodMapper, FoodRepository> {

    @Autowired
    public FoodService(FoodRepository repository, FoodMapper mapper) {
        super(repository, mapper);
    }

}