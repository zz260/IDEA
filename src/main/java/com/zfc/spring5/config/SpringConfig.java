package com.zfc.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zfc
 * @create 2021-09-01 15:50
 */
@Configuration//作为配置类，代替配置文件
@ComponentScan(basePackages = {"com.zfc.spring5"})
public class SpringConfig {

}

