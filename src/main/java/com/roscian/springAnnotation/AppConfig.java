package com.roscian.springAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.roscian.springAnnotation")
public class AppConfig {

    /*@Bean
    public com.roscian.springAnnotation.Samsung getPhone(){
        return new com.roscian.springAnnotation.Samsung();
    }

    @Bean
    public com.roscian.springAnnotation.MobileProcessor getProcessor(){
        return new com.roscian.springAnnotation.Snapdragon();

    }*/
}
