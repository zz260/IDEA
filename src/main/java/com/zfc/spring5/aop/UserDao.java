package com.zfc.spring5.aop;

/**
 * @author zfc
 * @create 2021-09-15 21:27
 */
public interface UserDao {
    public int add(int a,int b);

    public String update(String id);

    /**
     * 类中可以被增强的方法叫做连接点
     *
     * 类中实际被增强的方法叫做切入点
     *
     * 代码中实际被增强的部分叫做通知
     * 通知分前置通知，后置通知，环绕通知，异常通知，最终通知（类似try...catch中的finally）
     *
     * 把通知应用到切入点的过程叫做切面
     * 切入点语法：
     *      execution([权限修饰符][返回类型][类的全路径].[方法名称]([参数列表]))
     *
     *  举例：
     *      1、对UserDao中的add方法增强
     *      execution(* com.zfc.spring5.apo.UserDao.add(..))  //* 代表任意权限；返回类型省略；参数列表使用..代替
     *      2、对UserDao中的所有方法增强
     *      execution(* com.zfc.spring5.apo.UserDao.*(..))
     *      3、对com.zfc.spring5.aop包中所有类中的所有方法增强
     *      execution(* com.zfc.spring5.apo.*.*(..))
     */



}
