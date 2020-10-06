package com.spring.demo;

import demo.Agency;
import demo.AgencyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:value.properties")
public class SpringConfig {

    @Bean
    public Agency agency(){
        return new AgencyServices();
    }

    @Bean
    public Coach theCoach(){
        return new BaseballCoach(agency());
    }
}
