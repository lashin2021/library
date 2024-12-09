package com.company;

public class Notification {
    private int memberId;
    private String message;
    private String date;



    public Notification(int memberId, String message, String date) {
        this.memberId = memberId;
        this.message = message;
        this.date = date;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void displayNotifications(){
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Message: " + getMessage());
        System.out.println("Date: " + getDate());
    }
}
