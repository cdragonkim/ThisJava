package sec02_exam02_switch;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "부장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("600만원");
				break;
			default:
				System.out.println("500만원");
		}
	}

}
