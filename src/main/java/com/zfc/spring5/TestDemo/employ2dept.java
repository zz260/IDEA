package com.zfc.spring5.TestDemo;

import com.zfc.spring5.service.Employ;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zfc
 * @create 2021-08-27 16:03
 */
public class employ2dept {
    @Test
    public void ceate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("one2more.xml");

        Employ employ1=context.getBean("employ1",Employ.class);
        Employ employ2=context.getBean("employ2",Employ.class);
        Employ employ3=context.getBean("employ3",Employ.class);

        employ1.showtime();
        employ2.showtime();
        employ3.showtime();
    }
}
