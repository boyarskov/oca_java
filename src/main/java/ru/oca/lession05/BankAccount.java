package ru.oca.lession05;

public class BankAccount {
    int balance;
    int popolnnieScheta(int a) {
        return balance + a;
    }

    int snyatieSoScheta(int a) {
        return balance - a;
    }

    public static void main(String[] args) {
        BankAccount UserBankAccount = new BankAccount();
        UserBankAccount.balance = 1000;

        System.out.println(UserBankAccount.popolnnieScheta(500));
        System.out.println(UserBankAccount.snyatieSoScheta(900));
    }
}
