package frequentlyAskedProg;

import java.util.Scanner;

public class B_ReverseNumber {

	public static void main(String args[]) {

		System.out.print("Enter The Number to reverse here:");
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();

		sc.close();

/*		1. Approach One:
//
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;	rev in consequent iterations for 1234--- 4, 43, 432, 4321
//			num=num/10;
//		}
//		*/

/*		2. Using StringBuffer class

//		StringBuffer sbf=new StringBuffer(String.valueOf(num));

//		StringBuffer rev = sbf.reverse();
//		*/

//		3. Using StringBuilder class

		StringBuilder sbl=new StringBuilder();

		sbl.append(num);

		StringBuilder rev = sbl.reverse();

		System.out.println("The reversed number is:		"+rev);


	}
}
