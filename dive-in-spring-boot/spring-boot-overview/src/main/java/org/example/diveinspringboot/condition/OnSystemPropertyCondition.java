package org.example.diveinspringboot.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author lilongmin
 * @date 2022/9/12 12:18
 * @description
 */
public class OnSystemPropertyCondition implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String name = String.valueOf(attributes.get("name"));

        String value = String.valueOf(attributes.get("value"));

        String property = System.getProperty(name);

        return property.equals(value);

    }
}
