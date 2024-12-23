package com.testsigma.sdk;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestRailCredentials {
    private String username;
    private String password;
    private String url;
    private String projectId;
    private String projectName;
    private String title;
    private String parentRunId;
    private String junitUploadUrl;
}
