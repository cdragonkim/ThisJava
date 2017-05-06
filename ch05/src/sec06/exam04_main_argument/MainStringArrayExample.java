package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length != 2) {
			System.out.println("매소드 뒤에 num1 num2 arg 필요 ");
			System.exit(0);
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	}

}
