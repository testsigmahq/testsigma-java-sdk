package com.testsigma.sdk;

import java.util.List;

public interface OCR {
    public List<OCRTextPoint> extractTextFromElement(OCRImage image);
    public List<OCRTextPoint> extractTextFromPage(OCRImage image);
}
