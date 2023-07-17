package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class FindImageResponse {
    Boolean isFound;
    int x1;
    int y1;
    int x2;
    int y2;
}