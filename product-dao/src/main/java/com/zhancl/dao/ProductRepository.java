package com.zhancl.dao;

import com.zhancl.entity.ProductTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/5.
 */
public interface ProductRepository extends JpaRepository<ProductTest,Integer>{
}
