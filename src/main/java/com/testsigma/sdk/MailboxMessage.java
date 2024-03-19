package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
@Data
public class MailboxMessage {
    private String subject;
    private String sentTo;
    private String textMessage;
    private String htmlMessage;
    private String receivedFrom;
    private Map<String, String> attachmentUrls;
    private Timestamp receivedAt;
    private String receivedEmailMessageId;



    public String getOTP(String regex) throws Exception {
        String parsedOTP = null;
        if (getHtmlMessage() != null) {
            parsedOTP = parseOTP(regex, getTextMessage());
        }
        return parsedOTP;
    }

    public String urlWithText(String text)
            throws Exception {
        String url = getLinkWithTextFromHtml(text);
        if(url != null) {
            return url;
        }
        throw new Exception("No Url found");
    }

    public String urlWhichContains(String substring)
            throws Exception {
        List<String> allLinks = getLinksFromContent(null);
        for(String url : allLinks){
            if(url.contains(substring))
                return url;
        }
        throw new Exception("No Url found");
    }

    private String parseOTP(String regex, String message) throws Exception {
        if (regex == null) {
            regex = "\\d{4,8}";
        }
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                return matcher.group(0);
            } else {
                throw new Exception("OTP parsing failed with given regex.");
            }
        } catch (Exception e) {
            throw new Exception("OTP parsing failed - " + e.getMessage());
        }
    }




    private String getLinkWithTextFromHtml(String text) throws Exception {
        String parsedLink = null;
        if (getHtmlMessage() != null) {
            parsedLink = parseLinkWithTextFromHtml(getHtmlMessage(), text);
        }
        assert parsedLink != null;
        return parsedLink;
    }

    private String parseLinkWithTextFromHtml(String htmlMessage, String text) throws Exception{

    /*
          aTagRegex consists of 3 groups
          group 0 : will return the whole a tag(<a href="...">text</a>)
          group 1 : will return the href attribute which contains url only
          group 2 : will return the text associated with link
     */
        String aTagRegex = "<a\\s+[^>]*href=\"([^\"]*)\"[^>]*>(?:<a[^>]*>)*"+text+"(?:</a>)*</a>";
        String urlRegex = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        try{
            Matcher aTagMatcher = Pattern.compile(aTagRegex).matcher(htmlMessage);
            if(aTagMatcher.find()) {
                Matcher urlMatcher = Pattern.compile(urlRegex).matcher(aTagMatcher.group(1));
                if(urlMatcher.find()){
                    return aTagMatcher.group(1).substring(urlMatcher.start(0),urlMatcher.end(0));
                }
                else{
                    throw new Exception("No Url exists for link with Text " + text);
                }
            }
        } catch (Exception e){
            throw new Exception("URL Parsing Failed - " + e.getMessage());
        }
        return null;
    }


    private List<String> getLinksFromContent(String regex)
            throws Exception {
        List<String> parsedLink = null;
        if (this.getHtmlMessage() != null) {
            parsedLink = extractLinks(regex, getHtmlMessage());
        }
        assert parsedLink != null;
        return parsedLink;
    }

    private List<String> extractLinks(String regex, String message) throws Exception {
        if (regex == null) {
            regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        }
        try {
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(message);
            List<String> parsedURLs = new ArrayList<String>();
            while (matcher.find()) {
                parsedURLs.add(message.substring(matcher.start(0), matcher.end(0)));
            }
            if (!(parsedURLs.size() > 0)) {
                throw new Exception(" No URL found with matching condition in the email message.");
            }
            return parsedURLs;

        } catch (Exception e) {
            throw new Exception(" : URLs extraction failed - " + e.getMessage());
        }
    }
}
