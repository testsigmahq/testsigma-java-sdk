package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.util.List;


@RequiredArgsConstructor
@Data
public class AIRequest {
    List<File> files;

    String model;

    String prompt;
}
