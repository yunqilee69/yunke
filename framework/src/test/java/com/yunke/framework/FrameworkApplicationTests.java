package com.yunke.framework;

import com.yunke.framework.mapper.DictItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkApplicationTests {

    @Autowired
    DictItemMapper dictItemMapper;

    @Test
    void contextLoads() {
        System.out.println(dictItemMapper.selectAll());
    }

}
