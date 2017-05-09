package sec08.exam04_overloading;

public class Calculator {
	double areaRec(double width) {
		return width * width;
	}
	
	double areaRec(double width, double height) {
		return width * height;
	}
}
