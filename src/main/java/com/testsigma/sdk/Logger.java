package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Data
public class Logger {
    private final StringBuilder value;
    private static final String DEBUG = "DEBUG";
    private static final String INFO = "INFO";
    private static final String WARN = "WARN";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    public void debug(String message){
        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[2];
        setLogMessage(DEBUG, message, traceElement);
    }

    public void info(String message){
        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[2];
        setLogMessage(INFO, message, traceElement);
    }

    public void warn(String message){
        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[2];
        setLogMessage(WARN, message, traceElement);
    }

    public void setLogMessage(String methodName, String message, StackTraceElement traceElement){
        String className = traceElement.toString().split("\\(")[0];
        int lineNo = traceElement.getLineNumber();
        LocalDateTime currentTime = LocalDateTime.now();
        value.append(dtf.format(currentTime)).append(" ");
        value.append(methodName).append(" ");
        value.append(className).append(":").append(lineNo).append(" ");
        value.append(message).append("\n");
    }
}
