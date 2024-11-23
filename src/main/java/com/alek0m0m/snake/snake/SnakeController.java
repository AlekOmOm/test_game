package com.alek0m0m.snake.snake;

import com.Alek0m0m.library.spring.web.mvc.BaseRESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/snake")
public class SnakeController extends BaseRESTController<SnakeDTOInput, SnakeDTO, Snake, SnakeMapper, SnakeService, SnakeRepository> {

    @Autowired
    public SnakeController(SnakeService service) {
        super(service);
    }


}
