package com.zfc.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zfc
 * @create 2021-09-16 17:14
 */
@Configuration
@ComponentScan(basePackages = {"com.zfc.spring5.aopAnno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class aopConfig {
}
