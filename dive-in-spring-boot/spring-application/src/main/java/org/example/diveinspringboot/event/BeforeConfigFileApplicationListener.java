package org.example.diveinspringboot.event;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @auhtor llm
 * @data 2022/9/14 22:17
 */
public class BeforeConfigFileApplicationListener implements Ordered, SmartApplicationListener {
    @Override
    public int getOrder() {
        //這時候優先級是在加载配置文件这个时间发生之前，所以输出是null
//        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
        //这时候才会输出我们在配置文件里面配置的信息
        return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
    }

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            ConfigurableEnvironment environment = preparedEvent.getEnvironment();
            System.out.println("environment.getProperty(\"name\") : " + environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {

        }
    }
}
