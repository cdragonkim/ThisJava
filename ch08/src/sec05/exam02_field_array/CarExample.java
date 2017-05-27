package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
