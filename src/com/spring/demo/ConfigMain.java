package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class ConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach coach= applicationContext.getBean("theCoach",Coach.class);
        System.out.println(coach.workout());
        System.out.println(coach.getAdvice());
        System.out.println(coach.toString());
    }
}
