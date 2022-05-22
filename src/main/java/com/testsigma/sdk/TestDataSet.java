package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;

@Data
@RequiredArgsConstructor
public class TestDataSet {

    private final String name;
    private final JSONObject parameters;

    public String getParameter(String key){
        return parameters.get(key).toString();
    }
}