package org.example.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilongmin
 * @date 2022/9/12 13:59
 * @description
 */
public class SpringApplicationBootstrap {

    public static void main(String[] args) {

        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication application = new SpringApplication();
        application.setSources(sources);
        ConfigurableApplicationContext context = application.run(args);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
