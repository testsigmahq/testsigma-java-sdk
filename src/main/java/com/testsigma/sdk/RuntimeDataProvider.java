package com.testsigma.sdk;

public interface RuntimeDataProvider {
    
    String getRuntimeData(String variableName) throws Exception;
    
    String getRuntimeData(String variableName, String hierarchy) throws Exception;

}
