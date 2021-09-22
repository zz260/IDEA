package com.zfc.spring5.aopAnno;

import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-09-17 14:51
 */
@Component
public class Student {
    public void show(){
        System.out.println("学生类调用");
    }
}
