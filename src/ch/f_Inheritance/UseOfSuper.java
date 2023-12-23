package ch.f_Inheritance;

class A {

	int i = 25;

	void method() {
		System.out.println("Method from super");
	}
}

class B extends A {
	int i = 20;

	void method() {
		System.out.println("Mehtod from sub");
	}

	void show() {
		method();
		super.method();	
		System.out.println("This i is from sub class:	" + i);
		System.out.println("This is is from super class:	" + super.i);
		System.out.println("Sum of both i's:	" + (i + super.i));
	}
}

public class UseOfSuper {

	public static void main(String[] args) {

		B subObj = new B();
		subObj.method();//This will call the overridden method from subclass.
		subObj.show();
		// Calling method from superclass using the subclass object
//        subObj.super.method(); // This will cause a compile-time error, hence when there are overriding methods to call method from super class you have to create an instance of super class.

	}

}
