package com.alek0m0m.snake.food;

import com.Alek0m0m.library.spring.web.mvc.BaseRESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/food")
public class FoodController extends BaseRESTController<FoodDTOInput, FoodDTO, Food, FoodMapper, FoodService, FoodRepository> {

    @Autowired
    public FoodController(FoodService service) {
        super(service);
    }


}
