package com.zfc.spring5.TestDemo;

import com.zfc.spring5.config.SpringConfig;
import com.zfc.spring5.service.Empoly2;
import com.zfc.spring5.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * @author zfc
 * @create 2021-08-31 17:16
 */
public class TestService {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        StudentService service=context.getBean("studentService",StudentService.class);
        service.add();
    }

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Empoly2 empoly2=context.getBean("empoly2", Empoly2.class);
        empoly2.add();
    }

    @Test
    public void test3(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Empoly2 empoly2=context.getBean("empoly2", Empoly2.class);
        empoly2.add();
    }
}
