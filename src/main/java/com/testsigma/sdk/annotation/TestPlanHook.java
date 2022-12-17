package com.testsigma.sdk.annotation;

import com.testsigma.sdk.HookType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @TestPlanHook(name="Integrate with allureReports with {API Key}", Type=TestPlanHookType.After/Before)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestPlanHook {
    String name() default "";
    HookType type() default HookType.AFTER;
    String description() default "";
    boolean deprecated() default false;
}
