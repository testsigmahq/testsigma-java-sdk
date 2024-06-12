package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VariableData {
    private final String key;
    private final String value;
}
