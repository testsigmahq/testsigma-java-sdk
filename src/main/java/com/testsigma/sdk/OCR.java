package com.testsigma.sdk;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface OCR {
    public Map<String,List<OCRTextPoint>> extractTextFromPage();

    public Map<String,List<OCRTextPoint>> extractTextFromImage(OCRImage image);

    public Map<String,List<OCRTextPoint>> extractTextFromElement(Element element);

    public FindImageResponse findImage(String imageURl, Float threshold);

    public FindImageResponse findImage(String imageUrl);

    public  FindImageResponse findImage(String imageUrl, Float threshold, Integer scale);

    public void uploadFile(String s3SignedURL, File baseImageFile);

}
