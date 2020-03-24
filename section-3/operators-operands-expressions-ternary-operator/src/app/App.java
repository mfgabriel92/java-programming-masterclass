package app;

public class App {
    public static void main(String[] args) throws Exception {
        boolean myBoolean = false;
        String myString = myBoolean == true ? "myBoolean is true" : "myBoolean is false";

        System.out.println(myString);
    }
}