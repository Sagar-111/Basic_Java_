package ch.b_Operators;

public class IncrDecr {

	public static void main(String[] args) {

		int a=2;	int d;
		d=a++;		//is equivalent to two statement first 	d=a; 		then a=a+1;


		int b=3;	int c;
		c=++b;		//is equivalent to two statement first  b=b+1;		then  c=b;

		System.out.println("================Demonstration of operands in prefix and suffix==============");
		System.out.println("a:	"+a);
		System.out.println("b:	"+b);
		System.out.println("c:	"+c);
		System.out.println("d:	"+d);
	}

}
