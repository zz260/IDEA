package com.zfc.spring5.TestDemo;

import com.zfc.spring5.aopAnno.Book;
import com.zfc.spring5.config.aopConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-09-16 17:02
 */
public class aopxml {
    @Test
    public void testxml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aopbean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    //纯注解方式实现
    @Test
    public void testxml2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(aopConfig.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
