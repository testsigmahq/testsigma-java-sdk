package com.testsigma.sdk.runners;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CICDCredentials {
    private String username;
    private String password;
    private String url;
    private Integer cicdIntegrationId;
    private String addonOutputUploadUrl;
    private String cicdExecutionName;
}
