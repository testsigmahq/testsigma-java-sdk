package com.testsigma.sdk;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface OCR {
    public List<OCRTextPoint> extractTextFromPage();

    public List<OCRTextPoint> extractTextFromImage(OCRImage image);

    public List<OCRTextPoint> extractTextFromElement(Element element);

    public FindImageResponse findImage(String imageURl, Float threshold);

    public FindImageResponse findImage(String imageUrl);

    public  FindImageResponse findImage(String imageUrl, Float threshold, Integer scale);

    public FindImageResponse findImage(String imageUrl, Integer occurrence);

    public FindImageResponse findImage(String imageUrl, Integer occurrence, Float threshold);

    public void uploadFile(String s3SignedURL, File baseImageFile);

    public Map<String,List<OCRTextPoint>> extractTextAndSentencesFromImage(OCRImage image);

    public Map<String,List<OCRTextPoint>> extractTextAndSentencesFromImage();

}
