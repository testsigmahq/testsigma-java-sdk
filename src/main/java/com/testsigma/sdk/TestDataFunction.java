package com.testsigma.sdk;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;

@Data
public abstract class TestDataFunction {
  private static final int MESSAGE_MAX_SIZE = 500;
  protected String errorMessage;
  protected String successMessage;
  protected com.testsigma.sdk.Logger logger = new Logger(new StringBuilder());
  private StringBuffer loggedMessages = new StringBuffer();

  protected void setErrorMessage(String errorMessage) {
    this.errorMessage = StringUtils.abbreviate(errorMessage, MESSAGE_MAX_SIZE);
  }

  protected void setSuccessMessage(String successMessage) {
    this.successMessage = StringUtils.abbreviate(successMessage, MESSAGE_MAX_SIZE);
  }

  protected void log(Object message) {
    loggedMessages.append(message.toString()).append("<br>");
  }


  protected abstract TestData generate() throws Exception;
}
