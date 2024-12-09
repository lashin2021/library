package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactionList = new ArrayList<>();

    //constructor to initialize the transaction list
    public TransactionHistory(){
        transactionList = new ArrayList<>();
    }

    //method to add new transaction to the history
    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }

    public void checkAndNotify(){
        for (Transaction transaction : transactionList){

            if (transaction.getReturnDate().isBefore(LocalDate.now().plusDays(2))){
                Notification notification = new Notification(transaction.getTransactionId(),"Your return date is near!",LocalDate.now().toString());
                transaction.getMember().addNotification(notification);
            }
        }
    }

    //method to display all transaction
    public void viewAllTransaction(){
        for (Transaction transaction: transactionList)
            transaction.displayTransactionDetails();
    }

    //method shows all transactions made by a specific member
    public void getTransactionsByMember(String memberId){
        boolean found = false;
        for (Transaction transaction: transactionList){
            if (transaction.getMember().getMemberId().equals(memberId))
            {
                transaction.displayTransactionDetails();
                found = true;
            }
            if (!found){
                System.out.println("No transactions found for member with ID: " + memberId);
            }
        }
    }
}
