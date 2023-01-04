package com.testsigma.sdk;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@Data
public class TestMachineResult {
  Long id;
  Long environmentId;
  Result result;
  Timestamp startTime;
  Timestamp endTime;
  List<SuiteResult> suiteResults;
  Long targetMachineId;
  Long preRequisiteEnvironmentResultId;
  Boolean isRealDevice;
  Long consolidatedDuration;
  Boolean runTestSuitesInParallel;
}
