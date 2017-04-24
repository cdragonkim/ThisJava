package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y;
		System.out.println(z);
		
		long xl = 1000000;
		long yl = 1000000;
		
		long zl = x * y;
		System.out.println(z);	
		zl = xl * yl;
		System.out.println(zl);	
	}

}
