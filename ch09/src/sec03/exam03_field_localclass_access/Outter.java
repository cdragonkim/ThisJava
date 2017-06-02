package sec03.exam03_field_localclass_access;

public class Outter {
	public void method1(int arg) {
		int localVaribale = 1;
		//localVaribale =10;
		class Inner {
			void method() {
				int result = arg + localVaribale;
			}
		}
	}
}
