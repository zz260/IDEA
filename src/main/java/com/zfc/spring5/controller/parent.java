package com.zfc.spring5.controller;

/**
 * @author zfc
 * @create 2021-08-31 14:19
 */
public class parent {
    private String pName;

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "parent{" +
                "pName='" + pName + '\'' +
                '}';
    }
}
