package app;

public class App {
    public static void main(String[] args) throws Exception {
        double myDouble = 20.00;
        double mySecondDouble = 80.00;
        double myDoubleMath = (myDouble + mySecondDouble) * 100.00;
        double myFinalResult = myDoubleMath % 40.00;
        boolean isZero = (myFinalResult == 0) ? true : false;
        
        System.out.println("Result: " + myFinalResult);
        System.out.println("Has remainder: " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}