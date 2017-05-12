package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
		//		System.out.println(method.getName() + "에는 적용되어 있음");
		//	} else {
		//		System.out.println(method.getName() + "에는 적용되어 있지 않음");
				PrintAnnotation printAnnotation = 
						method.getAnnotation(PrintAnnotation.class);
//				System.out.println(method.getName() + ": ");
//				System.out.println(printAnnotation.value());
//				System.out.println(printAnnotation.number());
//				System.out.println();
				System.out.println("[" + method.getName() + "]");
				
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//method call
				try {
					method.invoke(new Service());
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
			}
		}
	}

}
