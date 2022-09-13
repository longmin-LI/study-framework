package org.example.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * @author lilongmin
 * @date 2022/9/12 10:46
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLeverRepository
public @interface SecondLeverRepository {

    String value() default "";
}
