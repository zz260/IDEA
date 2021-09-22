package com.zfc.spring5.controller;

/**
 * @author zfc
 * @create 2021-08-31 14:18
 */
public class person {
    private parent parent1;

    public void setParent1(parent parent1) {
        this.parent1 = parent1;
    }

    public void showPerson(){
        System.out.println(parent1);
    }
}
