package org.example;

public class Main {
    public static void main(String[] args) {
        BankTransaction bankTransaction = new BankTransaction();
        try {
            bankTransaction.performTransaction();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
