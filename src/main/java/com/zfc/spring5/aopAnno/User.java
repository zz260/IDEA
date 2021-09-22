package com.zfc.spring5.aopAnno;

import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-09-16 15:17
 */
//被增强类
@Component
public class User {
    public void add(){
        System.out.println("调用add方法");
    }

}
