package com.testsigma.sdk.runners;

import com.testsigma.sdk.TestDataFunction;
import com.testsigma.sdk.TestData;

import java.lang.reflect.Method;

public class TestDataFunctionRunner {
    public TestData run(TestDataFunction testDataFunction) throws Exception {
        Method execute = testDataFunction.getClass().getMethod("generate");
        execute.setAccessible(true);
        return (TestData) execute.invoke(testDataFunction);
    }
}
