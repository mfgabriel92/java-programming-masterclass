package app;

public class App {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(4021));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0 || seconds > 60))) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = (minutes % 60) + (seconds / 60);
        seconds = seconds % 60;

        String hoursString = Integer.toString(hours);
        hoursString = hours < 10 ? "0" + hours : hoursString;

        String minutesString = Integer.toString(minutes);
        minutesString = minutes < 10 ? "0" + minutes : minutesString;

        String secondsString = Integer.toString(seconds);
        secondsString = seconds < 10 ? "0" + seconds : secondsString;

        return hoursString + "h " + minutesString + "m " + secondsString + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}