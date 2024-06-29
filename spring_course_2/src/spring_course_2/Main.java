package spring_course_2;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

	TestClass testClass = new TestClass();
	
	Method method = testClass.getClass().getMethod("testMethod");
	
	MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
	
	System.out.println("Value is : " + annotation.log() );
	}

}
