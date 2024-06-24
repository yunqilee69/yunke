package com.yunke.framework.controller;

import com.yunke.common.base.redis.RedisCache;
import com.yunke.common.module.entity.DictItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Object test() {
        DictItem dictItem = new DictItem();
        dictItem.setCode("test");
        return dictItem;
    }

}
