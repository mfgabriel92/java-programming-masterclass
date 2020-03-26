package app;

public class App {
    public static void main(String[] args) throws Exception {
        int value = 4;

        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Three, four or Five, maybe");
                break;
            default:
                System.out.println("Some other value");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("What?");
                break;
        }
    }

}