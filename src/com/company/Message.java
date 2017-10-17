package com.company;

public class Message implements iMessage{

    public Message(){

        //This is a constructor
        //The constructor runs when we use keyword new
        // It's a good place to set default values for our variables
        //or to connect to the server
        this.connect();
    }
    private String sender;
    private String receiver;
    private String subject;
    private String message;


    public String getSender(){
        return sender;
    }
    public void setSender(String value){
        this.sender = value;
    }
    public String getReceiver(){
        return receiver;
    }
    public void setReceiver(String value){
        this.receiver = value;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String value){
        this.subject = value;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String value){
        this.message = value;
    }

    private void connect(){
        //This method connects to the server
        System.out.println("Connecting to mail server...");
    }
    public String send()
    {
        String result;
        result = "To: " +getReceiver() + "\n";
        result = "From:  " +getSender() + "\n";
        result = "Subject: " +getSubject() + "\n";
        result = "Message:" +getMessage();

        return result;
    }

}
