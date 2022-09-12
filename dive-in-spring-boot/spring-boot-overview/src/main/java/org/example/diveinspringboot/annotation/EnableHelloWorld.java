package org.example.diveinspringboot.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author lilongmin
 * @date 2022/9/12 11:05
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfiguration.class) 这种是直接导入相关的配置
@Import(HelloWorldImportSelector.class) //这种是间接的，就是能够增加一定的灵活度
public @interface EnableHelloWorld {
}
