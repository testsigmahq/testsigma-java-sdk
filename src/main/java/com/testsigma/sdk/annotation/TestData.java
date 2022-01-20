package com.testsigma.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestData {
  String reference() default "test-data";
  String description() default "";
  boolean deprecated() default false;
  String[] allowedValues() default {};
}
