package com.zfc.spring5.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-09-16 16:52
 */
@Component
@Aspect
public class BookProxy {
    @Before(value = "execution(* com.zfc.spring5.aopAnno.Book.buy(..))")
    public void before(){
        System.out.println("before......");
    }
}
