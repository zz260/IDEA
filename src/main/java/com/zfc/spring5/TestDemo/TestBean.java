package com.zfc.spring5.TestDemo;

import com.zfc.spring5.controller.Orders;
import com.zfc.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-08-27 13:46
 */
public class TestBean {
    @Test
    public void try1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("classBean2.xml");
        UserService userService=context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void try2(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("orderBean.xml");
        Orders orders=context.getBean("order", Orders.class);
        orders.getorder();
       context.close();
    }
}
