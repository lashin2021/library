package com.company;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private String email;
    private List<Book> borrowedBooks;
    private List<Notification> notifications = new ArrayList<>();

    public Member(String name, String memberId, String email) {
        this.name = name;
        this.memberId = memberId;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public void displayNotifications(){
        for (Notification notification: notifications){
            notification.displayNotifications();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public void borrow(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //method to borrow a book
    public void borrowBook(Book book, Library library){
        if (library.isBookAvailable(book)){
            borrowedBooks.add(book);
            library.removeBook(book);
            System.out.println(getName() + "has borrowed the book: "+ book.getBookTitle());
        }
        else
            System.out.println("The book" + book.getBookTitle() + "is not available for borrowing");
    }

    //method to return a book
    public void returnBook(Book book, Library library){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            library.addBook(book);
            System.out.println(getName() +"has return the book: "+ book.getBookTitle());
        } else
            System.out.println(getName() +" doesn't have the book "+ book.getBookTitle());

    }

    //method to display person details
    public void displayMemberDetails(){
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Member name: " + getName());
        System.out.println("Member email: " + getEmail());
        System.out.println("Borrowed books: ");
        for (Book book: borrowedBooks){
            book.displayDetails();
        }
    }
    //method to check if a person has borrowed a specific book
    public boolean hasBorrowed(Book book){
        return borrowedBooks.contains(book);
    }
}
