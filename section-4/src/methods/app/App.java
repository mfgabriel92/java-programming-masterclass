package methods.app;

public class App {
	public static void main(String[] args) {
//		calculateScore(true, 1000, 6, 150);
//		calculateScore(true, 10000, 12, 150);
		
	}
	
//	public static void calculateScore() {
//		boolean gameOver = true;
//		int score = 800;
//		int levelCompleted = 6;
//		int bonus = 100;
//		
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 1000;
//			System.out.println("Game over. Final score " + finalScore);
//		}
//	}
	
//	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 1000;
//			System.out.println("Game over. Final score " + finalScore);
//		}
//	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Game over. Final score " + finalScore);
			
			return finalScore;
		}
		
		return -1;
	}
}
