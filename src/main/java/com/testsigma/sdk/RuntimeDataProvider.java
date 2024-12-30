package com.testsigma.sdk;

public interface RuntimeDataProvider {
    
    String getRuntimeData(String variableName) throws Exception;
    
    String getRuntimeData(String variableName, ExecutionHierarchy executionHierarchy) throws Exception;

}
