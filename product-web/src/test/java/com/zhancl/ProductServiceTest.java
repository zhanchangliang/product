package com.zhancl;

import com.alibaba.fastjson.JSON;
import com.zhancl.dao.ProductRepository;
import com.zhancl.entity.ProductTest;
import com.zhancl.redis.RedisUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/11/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    Logger logger = LoggerFactory.getLogger(ProductServiceTest.class);
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void findTest(){
        List<ProductTest> list =productRepository.findAll();
        System.out.println(JSON.toJSON(list).toString());
    }


    @Test
    public void redisTest(){
        String name = "张三";
        logger.info("redis缓存开始："+name);
        redisUtils.set("name",name);
        String cacheName =redisUtils.get("name").toString();
        logger.info("缓存中的名字为："+name);

    }
}
