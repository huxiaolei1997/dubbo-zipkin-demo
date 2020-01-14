package com.xlh.dubbo.zipkin.demo.service.hello;

import com.xlh.dubbo.zipkin.demo.api.CongratulationService;
import com.xlh.dubbo.zipkin.demo.api.HelloService;

import java.util.Random;

public class HelloServiceImpl implements HelloService {
    private CongratulationService congratulationService;

    public void setCongratulationService(CongratulationService congratulationService) {
        this.congratulationService = congratulationService;
    }

    @Override
    public String hello(String message) {
        try {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {

        }
        return "hello, " + congratulationService.congratulation(message);
    }
}
