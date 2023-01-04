package com.testsigma.sdk;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunResult {
  TriggeredType triggeredType;
  Result result;
  Long id;
  Long executionId;
  String triggeredByEmail;
  Timestamp startTime;
  Timestamp endTime;
  List<TestMachineResult> machineResults;
  Long totalCount;
  Long failedCount;
  Long passedCount;
  Long consolidatedDuration;
  Long reRunParentId;
  RunResult reRunParentResult;
}
