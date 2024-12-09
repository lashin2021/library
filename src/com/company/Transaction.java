package com.company;

import java.time.LocalDate;


public class Transaction {
    private int transactionId;
    private Member member;
    private Book book;
    private String transactionType; //borrow or return
    private LocalDate transactionDate;
    private LocalDate returnDate;
    private int memberId;


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }




    public Transaction(int transactionId, Member member, Book book, String transactionType, LocalDate transactionDate, LocalDate returnDate, int memberId) {
        this.transactionId = transactionId;
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.memberId = memberId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    //method to display transaction details
    public void displayTransactionDetails(){
        System.out.println("Transaction ID: "+ transactionId);
        System.out.println("The member: "+ member.getName());
        System.out.println("The book: "+ book.getBookTitle());
        System.out.println("Type of transaction: "+ transactionType);
        System.out.println("Transaction date: " + transactionDate);
    }

    public String toString(){
        return "Transaction ID: "+ transactionId + "The member: "+ member.getName() + "The book: "+ book.getBookTitle() + "Type of transaction: "+ transactionType + "Transaction date: " + transactionDate;
    }
}
