package com.testsigma.sdk;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class RunTimeData {
  private Object value;
  private String key;
}
