package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123412-2323233","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.ssn = "222222";
		p1.name = "을지문덕";
		System.out.println(p1.name);
	} 

}
