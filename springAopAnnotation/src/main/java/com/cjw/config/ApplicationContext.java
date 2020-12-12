package com.cjw.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan(basePackages = {"com.cjw"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationContext {
}
