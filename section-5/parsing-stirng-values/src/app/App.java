package app;

public class App {
    public static void main(String[] args) throws Exception {
        String numAsString = "2020";
        System.out.println("Number as a String: " + numAsString);

        int numAsInt = Integer.parseInt(numAsString);
        System.out.println("Number as an int: " + numAsInt);
    }
}