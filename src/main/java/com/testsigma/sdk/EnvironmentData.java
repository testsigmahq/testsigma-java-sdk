package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@RequiredArgsConstructor
public class EnvironmentData {

    private final List<VariableData> variables;

    public String getParameter(String key){
        Optional<VariableData> variableData = variables.stream().filter(variable -> variable.getKey().equals(key))
                .collect(Collectors.toList()).stream().findFirst();
        return variableData.isPresent() ? variableData.get().getValue() : "";
    }

}