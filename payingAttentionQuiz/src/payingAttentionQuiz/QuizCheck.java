package payingAttentionQuiz;

public class QuizCheck {

	public static void main(String[] args) {

		int x = 9, y = 4;
		System.out.println( x > y + 4 );
		System.out.println (x > y++ * 2 );
		System.out.println( x * y <= 36);
		System.out.println( x / y == 1 );
		System.out.println( x % y);
		System.out.println (x > y ? "Worm" : "Words" );
	}

}
