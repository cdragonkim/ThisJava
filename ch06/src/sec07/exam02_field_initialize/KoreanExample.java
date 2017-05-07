package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "111111-1010100");
		System.out.println("nation = " + k1.nation);
		System.out.println("name = " + k1.name);
		System.out.println("ssn = " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("김자바", "902212-2010100");
		System.out.println("nation = " + k2.nation);
		System.out.println("name = " + k2.name);
		System.out.println("ssn = " + k2.ssn);
	}

}
