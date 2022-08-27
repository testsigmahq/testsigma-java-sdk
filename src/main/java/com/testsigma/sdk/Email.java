package com.testsigma.sdk;

import java.io.File;
import java.util.List;

public interface Email {
  void setTo(List<String> to);
  void setCc(List<String> cc);
  void setBcc(List<String> bcc);
  void setSubject(String subject);
  void setBody(String body);
  void setAttachments(List<File> attachments);

  Boolean send();
}
