package sec04.exam01_arithmetic;

public class InputDataChecjNaNExample {

	public static void main(String[] args) {
		String userInput ="NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		if(Double.isNaN(val)) {
			System.out.println("연산 불가");
			val = 0.0;
		}

	}

} 
