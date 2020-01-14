package com.xlh.dubbo.zipkin.demo.service.congratulation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/congratulation-service.xml");
        context.start();

        System.out.println("Congratulation service started");
        System.in.read();
    }
}
