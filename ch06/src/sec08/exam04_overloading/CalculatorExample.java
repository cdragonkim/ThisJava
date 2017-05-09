package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRec(10);
		double result2 = myCalc.areaRec(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
