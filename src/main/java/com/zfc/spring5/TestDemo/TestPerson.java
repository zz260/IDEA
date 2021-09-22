package com.zfc.spring5.TestDemo;

import com.zfc.spring5.controller.person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-08-31 14:24
 */
public class TestPerson {
    @Test
    public void trys(){
        ApplicationContext context=new ClassPathXmlApplicationContext("parentbean.xml");
        person person = context.getBean("person", person.class);
        person.showPerson();
    }
}
