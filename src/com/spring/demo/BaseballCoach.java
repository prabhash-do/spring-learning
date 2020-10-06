package com.spring.demo;

import demo.Agency;
import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach {

    private Agency agency;

    public BaseballCoach(Agency agency){
        this.agency=agency;
    }

    @Value("${foo.id}")
    private String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Value("${foo.name}")
    private String name;


    @Override
    public String workout() {
        return "Do hardwork";
    }

    public String getAdvice(){
        return agency.advice();
    }

    @Override
    public String toString() {
        return "BaseballCoach{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
