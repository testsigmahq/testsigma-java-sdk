package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public abstract class Mailbox {

    private String email;


    public abstract List<MailboxMessage> getMessages() throws Exception;

}
