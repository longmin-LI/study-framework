package org.example.diveinspringboot.bootstrp;

import org.example.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lilongmin
 * @date 2022/9/12 11:47
 * @description
 */
@SpringBootApplication(scanBasePackages = "org.example.diveinspringboot.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.calculate(1,2,3,4,5,6,7,8,9,10));
    }
}
