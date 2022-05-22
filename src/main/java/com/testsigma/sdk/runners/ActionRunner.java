package com.testsigma.sdk.runners;

import com.testsigma.sdk.DriverAction;
import com.testsigma.sdk.Action;
import com.testsigma.sdk.annotation.Element;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ActionRunner {
    private final WebDriver driver;

    public ActionRunner(WebDriver driver) throws Exception {
        if(driver == null){
            throw new Exception("Please provide a valid WebDriver object");
        }
        this.driver = driver;
    }

    public void run(DriverAction actionObject) throws Exception {
        actionObject.setDriver(driver);
        List<Field> elementFields = new ArrayList<>();
        Field[] declaredFields = actionObject.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
           if (declaredField.isAnnotationPresent(Element.class)) {
                declaredField.setAccessible(true);
                elementFields.add(declaredField);
            }
        }
        setDriverToElement(actionObject, elementFields);
        Method execute = actionObject.getClass().getMethod("execute");
        execute.setAccessible(true);
        execute.invoke(actionObject);
    }

    private void setDriverToElement(Action actionObject, List<Field> elementFields) throws Exception {
        for (Field elementField : elementFields) {
            com.testsigma.sdk.Element elementObj = (com.testsigma.sdk.Element) elementField.get(actionObject);
            elementObj.setDriver(driver);
            FieldUtils.writeField(elementField, actionObject, elementObj, true);
        }
    }

    public void quit() {
        driver.quit();
    }

}
