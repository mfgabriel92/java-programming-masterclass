package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");

        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - year;

            if (age < 0 || age > 100) {
                System.out.println("Something is wrong with your age");
            } else {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }
        } else {
            System.out.println("The year must be only numbers");
        }

        scanner.close();
    }
}