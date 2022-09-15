package org.example.web.servlet.support;

import org.example.web.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @auhtor llm
 * @data 2022/9/15 20:12
 */
public class DefaultAnnotationConfigDispatcherServletInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//web.xml
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//DispatcherServlet的配置
        return new Class[]{DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {//配置对应的路径映射
        return new String[]{"/"};

    }
}
