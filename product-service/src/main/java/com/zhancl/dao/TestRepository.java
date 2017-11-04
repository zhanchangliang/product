package com.zhancl.dao;

import com.zhancl.entity.TestJpa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/4.
 */
public interface TestRepository extends JpaRepository<TestJpa,Integer>{
}
