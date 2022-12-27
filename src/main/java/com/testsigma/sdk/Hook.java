package com.testsigma.sdk;


import org.apache.commons.lang3.StringUtils;

public abstract class Hook {
    private static final int MESSAGE_MAX_SIZE = 500;
    protected com.testsigma.sdk.Logger logger = new Logger(new StringBuilder(""));
    protected String errorMessage;
    protected String successMessage;
    private StringBuffer loggedMessages = new StringBuffer();
    protected abstract Result execute();

    protected void setErrorMessage(String errorMessage) {
        this.errorMessage = StringUtils.abbreviate(errorMessage, MESSAGE_MAX_SIZE);
    }

    protected void setSuccessMessage(String successMessage) {
        this.successMessage = StringUtils.abbreviate(successMessage, MESSAGE_MAX_SIZE);
    }
    protected void log(Object message){
        loggedMessages.append(message.toString()).append("<br>");
    }
}
