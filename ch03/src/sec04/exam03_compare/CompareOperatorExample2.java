package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v1 = 1;
		double v2 = 1.0;
		
		System.out.println(v2 == v1);
		
		double v3 = 0.1;
		float v4 = 0.1f;
		System.out.println(v3 == v4);
		System.out.println((float)v3 == v4);
	}

}
