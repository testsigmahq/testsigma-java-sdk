package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.Rectangle;

import java.util.List;

@RequiredArgsConstructor
@Data
public abstract class WindowsElement {
    private List<WindowsElementProperty> properties;
    private Rectangle boundingRectangle;

    public abstract void findElement() throws Exception;
}
