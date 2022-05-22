package com.testsigma.sdk.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface  TestDataFunction {
    String displayName();
    String description() default "";
    boolean deprecated() default false;
}
