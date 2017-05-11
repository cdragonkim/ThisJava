package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
	}
}
