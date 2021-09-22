package com.zfc.spring5.TestDemo;
import com.zfc.spring5.config.config1;
import com.zfc.spring5.service.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author zfc
 * @create 2021-09-11 15:55
 */
public class Testself {
    @Test
    public void Test(){
        ApplicationContext context=new AnnotationConfigApplicationContext(config1.class);
        Teacher teacher=context.getBean("teacher",Teacher.class);
        teacher.add();
    }
}
