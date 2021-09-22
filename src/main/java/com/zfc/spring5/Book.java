package com.zfc.spring5;

/**
 * @author zfc
 * @create 2021-08-27 10:43
 */
public class Book {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void book(){
        System.out.println("Twice try by myself ，i buy a book "+name);
    }
}
