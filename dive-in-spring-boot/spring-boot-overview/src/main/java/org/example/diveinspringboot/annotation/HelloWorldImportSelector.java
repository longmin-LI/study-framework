package org.example.diveinspringboot.annotation;

import org.example.diveinspringboot.configutation.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lilongmin
 * @date 2022/9/12 11:05
 * @description
 */
public class HelloWorldImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
