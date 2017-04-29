package sec04.exam01_arithmetic;

public class AccuracyExample3 {

	public static void main(String[] args) {
		// double result = 7 * 0.1;
		// System.out.println(result);
		
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		int temp = totalPiece - number;
		
		double result = temp  / 10.0;
		
		System.out.println(result);
	}

}
