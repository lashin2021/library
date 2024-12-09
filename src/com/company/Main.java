package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);

        Book book1 = new Book("Java Course","2011","George Orwel","12543");
        Book book2 = new Book("Clean Code", "2013", "Robert C.Martin", "13225");
        Member member1 = new Member("Mohamed Ali","001", "m.ali543@gmail.com");
        Member member2 = new Member("Ahmed Adel", "002","a.adel154@gmail.com");
        Magazine magazine1 = new Magazine("Sports","De stefano","12543","1984");
        Magazine magazine2 = new Magazine("Fashions","Mark","15467","2010");
        Transaction transaction1 = new Transaction(1, member1, book2, "borrow", LocalDate.now(),LocalDate.of(2024,12,20),001);
        Transaction transaction2 = new Transaction(2, member2, book1, "borrow", LocalDate.now(),LocalDate.of(2024,12,18),001);
        TransactionHistory transactionHistory = new TransactionHistory();

        //add members, books and magazines to the library
        library.addMember(member1);
        library.addMember(member2);
        library.addBook(book1);
        library.addBook(book2);
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);
        transactionHistory.addTransaction(transaction1);
        transactionHistory.addTransaction(transaction2);


        //menu for user input
        while (true){
            System.out.println("\nLibrarySystem menu: ");
            System.out.println("1. Display all items");
            System.out.println("2. Add new item");
            System.out.println("3. Register new member");
            System.out.println("4. View transaction history");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    library.displayBooks();
                    library.displayMagazine();
                    library.displayMembers();
                    break;
                case 2:
                    System.out.println("1- Add book title: ");
                    String title = input.nextLine();
                    System.out.println("2- Add publication year: ");
                    String year = input.nextLine();
                    System.out.println("3- Add author name: ");
                    String author = input.nextLine();
                    System.out.println("4- Enter ISBN number: ");
                    String isbn = input.nextLine();
                    Book book = new Book(title, year, author, isbn);
                    library.addBook(book);
                    break;
                case 3:
                    System.out.println("1- Enter member name: ");
                    String memberName = input.nextLine();
                    System.out.println("2- Enter member ID: ");
                    String memberId = input.nextLine();
                    System.out.println("3- Enter member e-mail: ");
                    String email = input.nextLine();
                    Member member = new Member(memberName,memberId,email);
                    library.addMember(member);
                    break;
                case 4:
                    transactionHistory.viewAllTransaction();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");


            }
        }





    }
}
