package com.company;

public class Book {
    private String bookTitle;
    private String PublicationYear;
    private String author;
    private String isbn;

    public Book() {
    }

    public Book(String bookTitle, String publicationYear, String author, String isbn) {
        this.bookTitle = bookTitle;
        this.PublicationYear = publicationYear;
        this.author = author;
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        PublicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void displayDetails(){
        System.out.println("Book title is: " + getBookTitle());
        System.out.println("Publication year is: " + getPublicationYear());
        System.out.println("The author is: " + getAuthor());
        System.out.println("ISBN is: " + getIsbn());
    }


}
