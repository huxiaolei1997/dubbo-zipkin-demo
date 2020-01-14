package com.xlh.dubbo.zipkin.demo.service.congratulation;

import com.xlh.dubbo.zipkin.demo.api.CongratulationService;

import java.util.Random;

public class CongratulationServiceImpl implements CongratulationService {
    @Override
    public String congratulation(String message) {
        try {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {

        }
        return "congratulation, " + message;
    }
}
