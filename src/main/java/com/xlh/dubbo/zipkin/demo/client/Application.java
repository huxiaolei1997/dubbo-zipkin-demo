package com.xlh.dubbo.zipkin.demo.client;

import com.xlh.dubbo.zipkin.demo.api.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/client.xml");
        context.start();
        // 获取远程代理并发起调用
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println(greetingService.greeting("world"));
    }
}
