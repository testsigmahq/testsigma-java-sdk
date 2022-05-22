package com.testsigma.sdk.annotation;

import com.testsigma.sdk.StepActionType;
import com.testsigma.sdk.ApplicationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
  String actionText();
  ApplicationType applicationType() default ApplicationType.WEB;
  StepActionType actionType() default StepActionType.NONE;
  String description() default "";
  boolean deprecated() default false;
}
