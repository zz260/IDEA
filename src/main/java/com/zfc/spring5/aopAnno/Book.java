package com.zfc.spring5.aopAnno;
import org.springframework.stereotype.Component;
/**
 * @author zfc
 * @create 2021-09-16 16:51
 */
@Component
public class Book {
    public void buy(){
        System.out.println("buy.....");
    }
}
