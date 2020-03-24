package app;

public class App {
    public static void main(String[] args) throws Exception {
        int scoreA = 50;
        int scoreB = 100;

        if (scoreA > 45 || scoreA > scoreB) {
            System.out.println("Score A wins");
        }
    }
}