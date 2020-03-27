package app;

public class Account {
    private String number;
    private double balance;
    private String owner;

    public Account() {
        this("000.000.000-00-00", "Unamed Owner");
        System.out.println("Empty constructor called. Assigning default values");
    }

    public Account(String number, String owner) {
        this.number = number;
        this.balance = 0.0;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            this.balance = 0.0;
            return;
        }

        this.balance += amount;
        System.out.println("New deposit of + $" + amount + " in " + getOwner() + "\'s account. Balance now stands at $" + getBalance());
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Please enter an amount bigger than 0");
            return;
        }

        double newBalance = this.balance - amount;

        if (newBalance < 0.0) {
            System.out.println("Insufficient balance.");
            return;
        }

        this.balance = newBalance;
        System.out.println("New withdrawal of + $" + amount + " in " + getOwner() + "\'s account. Balance now stands at $" + getBalance());
    }
}