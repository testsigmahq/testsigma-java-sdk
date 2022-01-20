package com.testsigma.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunTimeData {
  String reference() default "run-time-data";
  String description() default "";
  boolean deprecated() default false;
}
