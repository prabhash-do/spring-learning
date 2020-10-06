package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotation.xml");
        Coach coach=context.getBean("cricketCoach",Coach.class);
        System.out.println(coach.workout());
    }
}
