package com.zfc.spring5.TestDemo;

import com.zfc.spring5.dto.Book;
import com.zfc.spring5.dto.Course;
import com.zfc.spring5.service.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-08-30 16:12
 */
public class TestBook {
    @Test
    public void testStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bookBean.xml");
        Book book = context.getBean("book", Book.class);
        book.add();
    }


    @Test
    public void testbean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bookBean.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }
}
