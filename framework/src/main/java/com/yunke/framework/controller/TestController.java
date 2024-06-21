package com.yunke.framework.controller;

import com.yunke.common.module.entity.DictItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Object test() {
        DictItem dictItem = new DictItem();

        return dictItem;
    }

}
