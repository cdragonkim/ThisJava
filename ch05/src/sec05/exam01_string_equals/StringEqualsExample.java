package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김용철";
		String strVar2 = "김용철";

		if(strVar1 == strVar2) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		String strVar3 = new String("김용철");
		String strVar4 = new String("김용철");
		
		if(strVar3 == strVar4) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("문자열이 같음");
		}
	}

}