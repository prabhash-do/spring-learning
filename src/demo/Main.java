package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Company company=context.getBean("emp",Company.class);
        System.out.println(company.welcome());
        System.out.println(company.getAgencyService());
        System.out.println(company.toString());
    }
}
