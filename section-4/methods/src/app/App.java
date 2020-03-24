package app;

public class App {
    public static void main(String[] args) {
        // calculateScore(true, 1000, 6, 150);
        // calculateScore(true, 10000, 12, 150);

        // int highscore = calculateScore(true, 10000, 12, 150);
        // System.out.println("Highscore is " + highscore);

        int positionOne = calculateHighscorePosition(1500);
        displayHighscorePosition("Player One", positionOne);

        int positionTwo = calculateHighscorePosition(900);
        displayHighscorePosition("Player Two", positionTwo);

        int positionThree = calculateHighscorePosition(400);
        displayHighscorePosition("Player Three", positionThree);

        int positionFour = calculateHighscorePosition(50);
        displayHighscorePosition("Player Four", positionFour);
    }

    // public static void calculateScore() {
    // boolean gameOver = true;
    // int score = 800;
    // int levelCompleted = 6;
    // int bonus = 100;

    // if (gameOver) {
    // int finalScore = score + (levelCompleted * bonus);
    // finalScore += 1000;
    // System.out.println("Game over. Final score " + finalScore);
    // }
    // }

    // public static void calculateScore(boolean gameOver, int score, int
    // levelCompleted, int bonus) {
    // if (gameOver) {
    // int finalScore = score + (levelCompleted * bonus);
    // finalScore += 1000;
    // System.out.println("Game over. Final score " + finalScore);
    // }
    // }

    // public static int calculateScore(boolean gameOver, int score, int
    // levelCompleted, int bonus) {
    // if (gameOver) {
    // int finalScore = score + (levelCompleted * bonus);
    // finalScore += 1000;

    // return finalScore;
    // }

    // return -1;
    // }

    public static void displayHighscorePosition(String playerName, int position) {
        System.out.println(playerName + "is in the position #" + position + " on the highscore table");
    }

    public static int calculateHighscorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }

        return 4;
    }
}
