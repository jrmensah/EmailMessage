package com.company;

public class Main {

    public static void main(String[] args) {

        Message email = new Message();
        email.setSender("bart@fox.net");
        email.setReceiver("homer@fox.net");
        email.setSubject("Don't have a cow, man!");
        email.setMessage("Hello");
        String result = email.send();
        System.out.println(result);






    }
}
