package com.testsigma.sdk;

import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class DriverAction extends Action {
  @Setter
  protected WebDriver driver;
  public WebElement getElement(Element element) {
    return element.getElement();
  }
}
