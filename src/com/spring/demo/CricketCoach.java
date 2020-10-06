package com.spring.demo;

import org.springframework.stereotype.Component;

public class CricketCoach implements Coach {
    @Override
    public String workout() {

        return "Do daily workout";
    }

    @Override
    public String getAdvice() {
        return null;
    }


}
