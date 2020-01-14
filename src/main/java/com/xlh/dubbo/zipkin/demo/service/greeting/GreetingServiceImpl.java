package com.xlh.dubbo.zipkin.demo.service.greeting;

import com.xlh.dubbo.zipkin.demo.api.GreetingService;
import com.xlh.dubbo.zipkin.demo.api.HelloService;

import java.util.Random;

public class GreetingServiceImpl implements GreetingService {
    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String greeting(String message) {
        try {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {

        }
        return "greeting, " + helloService.hello(message);
    }
}
