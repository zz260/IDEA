package com.zfc.spring5.dto;

/**
 * @author zfc
 * @create 2021-08-30 14:48
 */
public class Course {
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
