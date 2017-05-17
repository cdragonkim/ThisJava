package sec07.exam08_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		SmartPhone samrtPhone =
				new SmartPhone("홍길동");
		samrtPhone.turnOn();
		samrtPhone.Internetsearch();
		samrtPhone.turnOff();
	}

}
