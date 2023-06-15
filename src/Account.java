package com.example.demo;

public class Account {
    private long accountNumber:
    private String name;
    private double balance;
    private final double RATE = 0.035d;

    public Account(long accountNumber, String name, double balance) {
        if(accountNumber< 0 )
            this.accountNumber = 99999;
        else
            this.accountNumber = accountNumber;
        if(name.equals(""))
            this.name = "no id";
        else
            this.name = name;
        if(balance<50000)
            throw new Exception("balance must be greater than 50k")
        else
            this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        if(accountNumber< 0 )
            this.accountNumber = 99999;
        else
            this.accountNumber = accountNumber;
        if(name.equals(""))
            this.name = "no id";
        else
            this.name = name;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposite(double amount){

        boolean logic = true;
        if(amount<0) logic = false;
        else
            balance += amount;

        return logic;

    }
    public boolean withdraw( double amount,
            double fee){
        boolean logic = true;

        if(amount > 0)
            if((amount + fee) > balance)
                balance = balance - (amount + fee);
            else {
                logic = false;
                System.out.println("not enough money!");
            }
        else {
            logic = false;
            System.out.println("amount is not < 0!");
        }

        return logic;
    }

    public void addInterest(){
        balance = balance + balance*RATE;
    }

    public boolean transper(Account acc2, double amount){
        boolean logic = true;

        if(this.balance > amount){
            this.balance = this.balance - amount;
            acc2.setBalance(acc2.getBalance() + amount);
        } else {
            logic = false;
        }

     return logic;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
