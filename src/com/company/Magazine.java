package com.company;

public class Magazine extends LibraryItem{
    private String issueNumber;
    private String year;

    public Magazine(String title, String author, String issueNumber, String year) {
        super(title, author);
        this.issueNumber = issueNumber;
        this.year = year;
    }


    //implementation for displayInfo abstract method from LibraryItem
    @Override
    public void displayInfo() {
        System.out.println("Magazine title: "+ getTitle());
        System.out.println("Magazine author: "+ getAuthor());
        System.out.println("Magazine issue number: "+ getIssueNumber());
        System.out.println("Year: "+ getYear());
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
