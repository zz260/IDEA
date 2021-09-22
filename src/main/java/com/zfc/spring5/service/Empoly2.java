package com.zfc.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zfc
 * @create 2021-09-01 9:16
 */
@Service(value = "empoly2")
public class Empoly2 {

   /**
    *  @Autowired//根据类型注入
    *  @Qualifier(value = "dept1")//根据名称注入,此时必须将@Autowired和@Qualifier联合使用
    */

    @Resource(name = "dept1")
    private Dept dept;

    @Value(value = "zfc")
    private String emName;

    public void add() {
        System.out.println(dept + "::" + emName);
    }
}
