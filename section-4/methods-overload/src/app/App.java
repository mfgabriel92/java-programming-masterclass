package app;

public class App {
    public static void main(String[] args) throws Exception {
//        int newScore = calculateScore();
//        
//        if (newScore > 0) {
//        	System.out.println("New score is " + newScore + " points");
//        }
    	System.out.println(calcFeetAndInchesToCentimiters(100));
    }

    public static double calcFeetAndInchesToCentimiters(double feet, double inches) {
    	if ((feet < 0) || ((inches <= 0) || (inches > 12))) {
    		System.out.println("Invalid parameters");
    		return -1;
    	}
    	
    	double centimiters = (feet * 12) * 2.54;
    	centimiters += inches * 2.54;
    	
    	return centimiters;
    }
    
    public static double calcFeetAndInchesToCentimiters(double inches) {
    	if (inches < 0) {
    		System.out.println("Invalid parameters");
    		return -1;
    	}
    	
    	double feet = (int) inches / 12;
    	double remaningInches = (int) feet % 12;
    	
    	return calcFeetAndInchesToCentimiters(feet, remaningInches);
    }
    
//	public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//    
//    public static int calculateScore(int score) {
//        System.out.println("Player scored " + score + " points.");
//        return score * 1000;
//    }
//
//    private static int calculateScore() {
//    	System.out.println("No player name or no score points. Unable to calculate anything.");
//    	return 0;
//    }
    
}