package com.zfc.spring5.TestDemo;

import com.zfc.spring5.aopAnno.Student;
import com.zfc.spring5.aopAnno.User;
import com.zfc.spring5.config.aopConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-09-16 15:32
 */
public class aopAnnoTest {
    @Test
    public void testAnno(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aopbean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void TestStu(){
        ApplicationContext context=new AnnotationConfigApplicationContext(aopConfig.class);
        Student student = context.getBean("student", Student.class);
        student.show();
    }
}
