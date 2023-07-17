package com.testsigma.sdk;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@Data
public class TestStepResult {
  Result result;
  Timestamp startTime;
  Timestamp endTime;
  TestStepType type;
  TestCaseResult stepGroupResult;
  Long testDataProfileId;
  String screenshotUrl;

  public TestStepResult setScreenshotUrl(String url){
    this.screenshotUrl = url;
    return this;
  }
}
