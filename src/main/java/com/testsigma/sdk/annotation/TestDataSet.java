package com.testsigma.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestDataSet {
    String reference() default "set-name";
    String profileReference() default "profile-name";
    String description() default "";
    boolean deprecated() default false;
}
