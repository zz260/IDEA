package com.zfc.spring5.TestDemo;

import com.zfc.spring5.service.stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-08-30 14:11
 */
public class TestStu {
    @Test
    public void testStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("stubean.xml");
        stu student = context.getBean("stu", stu.class);
        student.show();
    }
}
