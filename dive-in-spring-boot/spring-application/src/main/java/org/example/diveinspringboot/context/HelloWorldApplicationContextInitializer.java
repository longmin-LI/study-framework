package org.example.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author lilongmin
 * @date 2022/9/12 13:52
 * @description
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    //这就是一个回调机制，可以允许我们回调一下applicationContext
    //但是注意这里不能使用getBean，因为bean还没初始化好
    @Override
    public void initialize(C c) {
        System.out.println("ConfigurableApplicationContext.id = () " + c.getId());
    }
}
