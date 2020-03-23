package app;

public class App {
    public static void main(String[] args) throws Exception {
        String myString = "This is my string";
        System.out.println("My string is: " + myString);

        myString = myString + ", and this too.";
        System.out.println("My string is: " + myString);

        String myNumberString = "300.50";
        myNumberString = myNumberString + "500.45";
        System.out.println(myNumberString);

        int myInt = 10;
        myNumberString = "300.50" + myInt;
        System.out.println(myNumberString);
    }
}