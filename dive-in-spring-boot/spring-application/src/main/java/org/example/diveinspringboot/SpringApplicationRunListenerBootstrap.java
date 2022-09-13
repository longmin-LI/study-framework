package org.example.diveinspringboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lilongmin
 * @date 2022/9/12 16:38
 * @description
 */
public class SpringApplicationRunListenerBootstrap {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.addApplicationListener(event -> {
            System.out.println("坚挺到事件：" + event);
        });

        context.refresh();

        context.publishEvent("caonima");

        context.close();
    }
}
