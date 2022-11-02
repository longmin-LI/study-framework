package org.example.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot引导类
 * @auhtor llm
 * @data 2022/9/15 21:00
 */
@SpringBootApplication(scanBasePackages = "org.example.web")
public class SpringBootWebMvcBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class,args);

    }
}
