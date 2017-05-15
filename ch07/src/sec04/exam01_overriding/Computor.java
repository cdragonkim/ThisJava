package sec04.exam01_overriding;

public class Computor extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computor 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
