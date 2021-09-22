package com.zfc.spring5.controller;

/**
 * @author zfc
 * @create 2021-08-31 10:39
 */
public class Orders {
    public Orders() {
        System.out.println("1、调用无参构造函数");
    }
    private String oName;

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("2、调用set方法");
    }

    public void initClass(){
        System.out.println("3、调用初始化方法");
    }
    public void getorder(){
        System.out.println("4、获取创建对象");
    }
    public void destroyorder(){
        System.out.println("5、销毁对象实例");
    }

}
