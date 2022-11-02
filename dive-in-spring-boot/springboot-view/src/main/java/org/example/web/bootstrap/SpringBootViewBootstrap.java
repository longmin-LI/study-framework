package org.example.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auhtor llm
 * @data 2022/10/27 14:40
 */
@SpringBootApplication(scanBasePackages = "org.example.web")
public class SpringBootViewBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootViewBootstrap.class,args);
    }
}
