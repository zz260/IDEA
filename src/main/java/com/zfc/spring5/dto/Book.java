package com.zfc.spring5.dto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author zfc
 * @create 2021-08-30 15:52
 */
public class Book {
    private List<String> bName;

    public void setbName(List<String> bName) {
        this.bName = bName;
    }

    public void add(){
        System.out.println(bName);
    }
}
