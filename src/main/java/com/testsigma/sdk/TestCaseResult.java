package com.testsigma.sdk;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@Data
public class TestCaseResult {
  Result result;
  Timestamp startTime;
  Timestamp endTime;
  List<IterationResult> iterationResults;
  Long testDataProfileId;
}