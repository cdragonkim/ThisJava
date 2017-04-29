package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
	
		try {
			int z = x / y;
			System.out.println(z);
		} catch(ArithmeticException e) {
			System.out.println("0 으로 나누면 안됨");
		}
		
	}

}
