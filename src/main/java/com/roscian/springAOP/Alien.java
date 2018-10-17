package com.roscian.springAOP;

import org.springframework.stereotype.Component;


//Aspect Oriented Programming
//Cross cutting concerns -> Aspect
@Component
public class Alien {

    public void show(){

        System.out.println();

        System.out.println("Hello world");
    }
}
