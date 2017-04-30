package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "김용철";
		String str2 = "김용철";
		String str3 = new String("김용철");

		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}

}
