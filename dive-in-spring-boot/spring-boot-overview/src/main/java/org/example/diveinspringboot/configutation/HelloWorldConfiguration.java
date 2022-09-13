package org.example.diveinspringboot.configutation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lilongmin
 * @date 2022/9/12 11:06
 * @description
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "hello, world";
    }
}
