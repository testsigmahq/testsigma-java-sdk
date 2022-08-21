package com.testsigma.sdk;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RunMetaData {
    private Boolean isAdHocRun;
    private TriggeredType triggerType;
    private Long runId;
    private Date startTime;
    private String triggeredByEmail;
    private Long testDataId;
}
