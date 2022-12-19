package com.testsigma.sdk;


public abstract class Hook {
    protected com.testsigma.sdk.Logger logger = new Logger(new StringBuilder(""));
    protected abstract Result execute();
}
