package org.example.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @auhtor llm
 * @data 2022/9/7 22:53
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "org.example.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(DiveInSpringBootApplication.class)
//                .web(WebApplicationType.SERVLET)
//                .run(args);

        SpringApplication.run(DiveInSpringBootApplication.class, args);
    }
}
