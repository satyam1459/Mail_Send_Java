package com.example.sendmailusingjava;

public class Main {
    public static void main(String[] args) {

        //Prparing
        System.out.println("Start sending---->");
        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }
}
