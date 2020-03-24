package app;

public class App {
    public static void main(String[] args) throws Exception {
        int score = 49;

        if (score == 100) {
            System.out.println("You got the high score!");
        }

        if (score != 100) {
            System.out.println("You did not get the high score...");
        }

        if (score >= 50) {
            System.out.println("You got a score over 50");
        }

        if (score < 50) {
            System.out.println("You got a score under 50");
        }

        int secondScore = 25;

        if (secondScore > 10 && secondScore < 20) {
            System.out.println("You got a score between 10 and 20");
        }
    }
}