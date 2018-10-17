package com.roscian.springAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Advice -> what -> Before, After
//Point cut -> Where/When
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
    @Before("execution(public void show())")
    public void log(){
        System.out.println("Show some logs ");
    }
}
