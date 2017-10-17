package com.company;

public interface iMessage {

    //Define all public methods
    String getSender();
    void setSender(String value);
    String getReceiver();
    void setReceiver(String value);
    String getSubject();
    void setSubject(String value);
    String getMessage();
    void setMessage(String value);

    String send();
}
