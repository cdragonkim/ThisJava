package sec03.exma01_promotion;

// 자동 타입 변환
public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);

		char charValue ='가';
		intValue = charValue;
		System.out.println("가의 uniCode = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
