package someBasicProgramms;

public class ASwappingNumbers {

	public static void main(String[] args) {
		int a = 12, b = 15;

		System.out.println("Numbers Before swapping:	" + a + "	" + b);

/*		First Method: using Third variable. 
		 
		 int t=a; 
		 a=b; 
		 b=t;
		 */
		
//		Second Method: Using + and - Operator. without third number.
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
/*		Third Method: Using * and / Operator. without third number.
		
		a=a*b;
		b=a/b;
		a=a/b;
		*/
	
		
/*		Fourth Method: Using bitwise/XOR/^ Operator.
		
		a=a^b;
		b=a^b;
		a=a^b;
		*/
		System.out.println("Numbers After swapping:		" + a + "	" + b);
	}
}
