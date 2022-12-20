package com.testsigma.sdk;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@RequiredArgsConstructor
@Data
public class IterationResult {
  Result result;
  Timestamp startTime;
  Timestamp endTime;
  Long testDataSetId;
}
