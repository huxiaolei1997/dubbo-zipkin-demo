package com.xlh.dubbo.zipkin.demo.service.greeting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Applicatioin {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/greeting-service.xml");
        context.start();

        System.out.println("Greeting service started");
        System.in.read();
    }
}
