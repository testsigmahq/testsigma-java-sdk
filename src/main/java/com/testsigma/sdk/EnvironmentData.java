package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;

@Data
@RequiredArgsConstructor
public class EnvironmentData {

    private final JSONObject parameters;

    public String getParameter(String key){
        return parameters.get(key).toString();
    }

}