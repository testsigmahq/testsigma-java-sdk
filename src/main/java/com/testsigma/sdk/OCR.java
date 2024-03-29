package com.testsigma.sdk;

import java.util.List;

public interface OCR {
    public List<OCRTextPoint> extractTextFromPage();

    public List<OCRTextPoint> extractTextFromImage(OCRImage image);

    public List<OCRTextPoint> extractTextFromElement(Element element);
}
