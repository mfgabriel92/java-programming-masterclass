package app;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 7; i++) {
            Movie movie = getRandomMovie();
            System.out.println("Movie #" + i  + ": " + movie.getName() + "\nPlot: " + movie.plot() + "\n");
        }
    }

    public static Movie getRandomMovie() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new ResidentEvil();
            case 2:
                return new Terminator();
            case 3:
                return new TheHulk();
            default:
                return null;
        }
    }
}