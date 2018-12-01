package com.ddlab.rnd.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.ddlab.rnd.aop")
@EnableAspectJAutoProxy
public class SpringNoXmlConfig {

}
