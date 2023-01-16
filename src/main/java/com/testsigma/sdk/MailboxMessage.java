package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class MailboxMessage {
    private String subject;
    private String sentTo;
    private String textMessage;
    private String htmlMessage;
    private String receivedFrom;
}
