package org.example.diveinspringboot.configutation;

import org.example.diveinspringboot.annotation.EnableHelloWorld;
import org.example.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author lilongmin
 * @date 2022/9/12 12:58
 * @description
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "dell") // 条件装配
public class HelloWorldAutoConfiguration {
}
