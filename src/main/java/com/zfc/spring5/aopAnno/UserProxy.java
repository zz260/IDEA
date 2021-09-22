package com.zfc.spring5.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zfc
 * @create 2021-09-16 15:18
 */
//增强类,
/**
 * 当多个增强类在同意方法上增强如何设置优先级
 * 在增强类上加注解Order(value(int))  value越大，优先级越低
 * */
@Component
@Aspect
public class UserProxy{

    /**
     * 抽取公共切入点
     * */
    @Pointcut(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void point(){

    }
/*    @Before(value = "point()")
    public void showUser(){
        System.out.println("调用前置通知");
    }*/


    //前置通知

    @Before(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void showUser(){
        System.out.println("调用前置通知");
    }



    //  最终   通知(一定会调用)
    @After(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void after(){
        System.out.println("调用after通知");
    }

    //   后置  通知（异常时不会调用）
    @AfterReturning(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void afterReturning(){
        System.out.println("调用afterReturning通知");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("调用afterThrowing通知");
    }


    //环绕通知（异常时后置通知不会调用，只会调用前置通知）
    @Around(value = "execution(* com.zfc.spring5.aopAnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("调用around通知,before方法");

        proceedingJoinPoint.proceed();
        System.out.println("调用around通知,after方法");
    }
}
