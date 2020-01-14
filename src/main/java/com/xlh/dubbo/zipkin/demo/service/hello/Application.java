package com.xlh.dubbo.zipkin.demo.service.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/hello-service.xml");
        context.start();

        System.out.println("Hello service started");
        System.in.read();
    }
}
