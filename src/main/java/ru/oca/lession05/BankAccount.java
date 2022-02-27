package ru.oca.lession05;

public class BankAccount {
    int balance;
    String name;

    int popolnenieScheta(int plus) {
        System.out.println(name + " Balance: " + balance);
        System.out.println("Topping up the balance on " + plus);
        balance += plus;
        System.out.println(name + " New balance: " + balance);
        return balance;
    }

    int snyatieSoScheta(int minus) {
        System.out.println(name + " Balance: " + balance);
        System.out.println("Reducing the balance on " + minus);
        balance -= minus;
        System.out.println(name + " New balance: " + balance);
        return balance;
    }

    void showInfo() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.balance = 55;
        account1.name = "Alex";
        account1.popolnenieScheta(9);
        account1.snyatieSoScheta(12);
        System.out.println();
        BankAccount account2 = new BankAccount();
        account2.balance = 1355;
        account2.name = "Max";
        account2.popolnenieScheta(231);
        account2.snyatieSoScheta(1000);
    }
}
