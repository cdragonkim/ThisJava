package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		
		int i1;
		for(i1=1; i1<=100; i1++) {
			sum += i1;
		}
		
		System.out.println("1 ~ " + i1 + "까지의 합 : " + sum);
		
	}

}
