package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A {
	public D() {
		super();
		this.filed = "value";
		this.method();
	}
	
	public void method() {
		this.filed = "Value";
		this.method();
	}
}
