package sec04.exam04_compare_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		int charCode1 = 'a';
		int charCode2 = '0';
		
		if (charCode >= 65 && charCode < 90) {
			System.out.println("대문자이군요.");
		}
		
		if (charCode1 >= 97 && charCode1 < 122) {
			System.out.println("소문자이군요.");
		}
		
		if (!(charCode2 < 48) && !(charCode2 > 57)) {
			System.out.println("숫자이군요.");
		}
		
		int val = 6;
		if (val%2 == 0 | val%3 == 0) {
			System.out.println("2 or 3 배수");
		}
	}

}
