package app;

public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account("123.456.789.10-11", "Gabriel");

        account.deposit(100.0);
        account.deposit(50.0);
        account.withdraw(700.0);
    }
}