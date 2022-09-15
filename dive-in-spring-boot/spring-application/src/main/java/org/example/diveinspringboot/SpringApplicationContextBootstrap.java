package org.example.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @auhtor llm
 * @data 2022/9/14 22:37
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println("类型为：" + context.getClass().getName());

        context.close();
    }
}
