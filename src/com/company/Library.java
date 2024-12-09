package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();

    public Library() {
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    // method to add book
    public void addBook(Book book) {
        books.add(book);
    }


    //method to remove book
    public void removeBook(Book book){
        books.remove(book);
    }

    //method to add member
    public void addMember(Member member){
        members.add(member);
    }

    //method to remove member
    public void removeMember(Member member){
        members.remove(member);
    }

    //method to add magazine
    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    //method to remove magazine
    public void removeMagazine(Magazine magazine){
        members.remove(magazine);
    }

    //check if a book is available to borrow
    public boolean isBookAvailable(Book book){
        return books.contains(book);
    }

    // method to delete a book by ISBN
    public void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equalsIgnoreCase(isbn));
    }

    //method to search for books by title
    public Book findBook(String title){
        for (Book book : books){
            if (book.getBookTitle().equalsIgnoreCase(title) )
                return book;
        }
        return null; // if the book not found
    }

    //method to find a member by ID
    public Member findMember(String memberId){
        for (Member member: members){
            if (member.getMemberId().equalsIgnoreCase(memberId))
                return member;
        }
        return null;
    }

    //method to display all members
    public void displayMembers(){
        if (members.isEmpty())
            System.out.println("No members found");
        else {
            for (Member member: members)
            {
                System.out.println("Member name: " + member.getName());
                System.out.println("Member ID: "+ member.getMemberId());
                System.out.println("Email: " + member.getEmail());
                System.out.println("Member has borrowed: "+ member.getBorrowedBooks());
            }
        }
    }

    //method to display all books
    public void displayBooks(){
        if (books.isEmpty())
            System.out.println("no books in library.");
        else{
            for(Book book: books)
                book.displayDetails();
        }
    }

    //method to display all magazines
    public void displayMagazine(){
        if (magazines.isEmpty())
            System.out.println("no magazines in library.");
        else{
            for(Magazine magazine: magazines)
                magazine.displayInfo();
        }
    }
}
