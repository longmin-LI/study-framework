package org.example.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * web配置类，配置自定义视图解析器，和拦截器
 * @auhtor llm
 * @data 2022/10/27 16:27
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        //改变这个视图解析器的优先级，因为thymeleaf视图解析器的优先级为LOWEST_PRECEDENCE-5
        //提高他的优先级就可以实现他们共存了
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE-10);
        //如果我们把优先级最高的这个ViewResolver的content-type修改了
        viewResolver.setContentType("text/xml:charset=UTF-8");
        return viewResolver;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中...");
                return true;
            }
        });
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer){
        configurer.favorParameter(true)
                .favorPathExtension(true);
    }

    //如果我们直接用spring boot启动项目，会出现找不到index.jsp这个页面的bug
    //原因：springboot内嵌的tomcat容器在解析资源路径的时候，默认的是大目录下，也就是dive-in-spring-boot
    //但其实真实的文件放在springboot-view这个module里面
    //修改方法：通过修改内嵌的tomcat容器的DocBase
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer(){
        return (factory) -> {
            factory.addContextCustomizers((context) -> {
                String relativePath = "springboot-view/src/main/webapp";
                context.setDocBase(new File(relativePath).getAbsolutePath());
            });
        };
    }

}
