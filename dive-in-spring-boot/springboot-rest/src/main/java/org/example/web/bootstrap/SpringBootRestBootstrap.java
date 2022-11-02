package org.example.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auhtor llm
 * @data 2022/10/28 14:26
 */
@SpringBootApplication(scanBasePackages = "org.example.web")
public class SpringBootRestBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootRestBootstrap.class,args);
    }
}
