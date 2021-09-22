package com.zfc.spring5.service;

/**
 * @author zfc
 * @create 2021-08-27 15:59
 */
public class Employ {
    private String eName;
    private String eSex;
    private Dept dept;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void showtime() {
        System.out.println(eName + "是一个" + eSex + "程序员，他在" + dept.getdName() + "工作：：" + dept);
    }
}
