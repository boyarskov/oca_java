package ru.oca.lession05;

public class BankAccount {
    int balance;

    int popolnenieScheta(int plus) {
        balance += plus;
        return balance;
    }

    int snyatieSoScheta(int minus) {
        balance -= minus;
        return balance;
    }

    void showInfo() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.balance = 55;
        account1.showInfo();
        account1.snyatieSoScheta(2);
        account1.showInfo();
        account1.popolnenieScheta(9);
        account1.showInfo();
    }
}
