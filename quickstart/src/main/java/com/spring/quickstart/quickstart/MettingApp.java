package com.spring.quickstart.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MettingApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Metting metting = context.getBean(Metting.class);
        System.out.println(metting);
    }
    
}
