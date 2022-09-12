package org.example.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author lilongmin
 * @date 2022/9/12 11:44
 * @description
 */
@Service
@Profile("java7")
public class CalculateServiceJava7 implements CalculateService{

    @Override
    public Integer calculate(Integer... values) {
        System.out.println("java7for循环实现");
        int sum = 0;
        for(int i = 0;i < values.length;i++){
            sum += values[i];
        }
        return sum;
    }
}
