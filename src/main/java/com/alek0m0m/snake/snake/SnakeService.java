package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.spring.web.mvc.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnakeService extends BaseService<SnakeDTOInput, SnakeDTO, Snake, SnakeMapper, SnakeRepository> {

    @Autowired
    public SnakeService(SnakeRepository repository, SnakeMapper mapper) {
        super(repository, mapper);
    }

    // --------------------- Business methods ---------------------


}