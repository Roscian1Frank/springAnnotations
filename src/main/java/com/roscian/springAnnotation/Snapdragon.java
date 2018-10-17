package com.roscian.springAnnotation;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor{

    public void process() {
        System.out.println("World best CPU");
    }
}
