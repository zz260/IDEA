package com.zfc.spring5.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-09-17 14:52
 */
@Component
@Aspect
public class StudentProxy {
    @Before(value = "execution(* com.zfc.spring5.aopAnno.Student.show(..))")
    public void show1(){
        System.out.println("前置通知");
    }
}
