package com.alek0m0m.snake.block;

import com.Alek0m0m.library.spring.web.mvc.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockService extends BaseService<BlockDTOInput, BlockDTO, Block, BlockMapper, BlockRepository> {

    @Autowired
    public BlockService(BlockRepository repository, BlockMapper mapper) {
        super(repository, mapper);
    }

    // --------------------- Business Logic Operations ---------------------


}