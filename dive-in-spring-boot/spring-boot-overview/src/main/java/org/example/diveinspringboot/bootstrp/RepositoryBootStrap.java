package org.example.diveinspringboot.bootstrp;

import org.example.diveinspringboot.annotation.EnableHelloWorld;
import org.example.diveinspringboot.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lilongmin
 * @date 2022/9/12 10:40
 * @description
 */
@ComponentScan(basePackages = "org.example.diveinspringboot.repository")
@EnableHelloWorld
public class RepositoryBootStrap {

    public static void main(String[] args) {
        //这样就是把RepositoryBootStrap这个类当成一个配置bean
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyRepository myRepository = context.getBean("myRepository", MyRepository.class);
        System.out.println(myRepository);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
        context.close();
    }
}
