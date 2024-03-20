package com.testsigma.sdk;

import org.apache.http.entity.ContentType;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Email {
  void setTo(List<String> to);
  void setCc(List<String> cc);
  void setBcc(List<String> bcc);
  void setSubject(String subject);
  void setBody(String body);
  void setAttachments(List<File> attachments);

  void setContentType(ContentType contentType);
  void addHeader(Map<String, String> headersList);

  String getMessageId(String headers);
  Boolean send();
}
