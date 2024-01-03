package someBasicProgramms;

import java.util.Scanner;

public class BReverseNumber {

	public static void main(String args[]) {

		System.out.print("Enter The Number to reverse here:");
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();

		sc.close();

/*		Approach One:

		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;	rev in consequent iterations for 1234--- 4, 43, 432, 4321
			num=num/10;
		}
		*/

/*		Using StringBuffer class

		StringBuffer sbf=new StringBuffer(String.valueOf(num));

		StringBuffer rev = sbf.reverse();
		*/

//		Using StringBuilder class

		StringBuilder sbl=new StringBuilder();

		sbl.append(num);

		StringBuilder rev = sbl.reverse();

//		You will get this in chapter_18-String Handling.

		System.out.println("The reversed number is:		"+rev);

	}
}
