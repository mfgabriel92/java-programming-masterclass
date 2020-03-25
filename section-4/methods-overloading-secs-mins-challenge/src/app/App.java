package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(4000));

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0 || seconds > 60))) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        minutes = (minutes % 60) + (seconds / 60);
        seconds = seconds % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}