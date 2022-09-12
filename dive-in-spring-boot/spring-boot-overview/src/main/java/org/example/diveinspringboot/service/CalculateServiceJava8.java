package org.example.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author lilongmin
 * @date 2022/9/12 11:46
 * @description
 */
@Service
@Profile("java8")
public class CalculateServiceJava8 implements CalculateService{
    @Override
    public Integer calculate(Integer... values) {
        System.out.println("java 8 lambda表达式");
        int sum = 0;
        sum = Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }
}
