package com.yunke.admin;

import com.yunke.common.base.redis.RedisCache;
import com.yunke.common.module.entity.Dict;
import com.yunke.framework.mapper.DictMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void test() {
        redisCache.setCacheObject("test", "testValue");
    }
}
