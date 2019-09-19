package com.zhibinwang;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 花开
 * @create 2019-09-12 0:22
 * @desc
 **/
@Aspect
@Component
@Order(0)
public class SwitchDataSourceAOP {

//    @Pointcut("@annotation(DataSource)") // 拦截自定义的注解，dataSource
//    public void switchDataSource(DataSource dataSource){}



    @Before("@annotation(dataSource)")
    public void process(JoinPoint joinPoint,DataSource dataSource){
     DataSourceContextHolder.setDbType(dataSource.value());
    }
}
