package com.zfc.spring5;

/**
 * @author zfc
 * @create 2021-08-26 14:12
 */
public class User {
    private String name;
    private String age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void user1() {
        System.out.println("try by myself " + name + "::" + age);
    }
}
