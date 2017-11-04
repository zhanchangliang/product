package com.zhancl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/4.
 */
@RestController
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/hello")
    public String hello(){
        logger.info("开始调用");
        return "Hello Word";
    }
}
