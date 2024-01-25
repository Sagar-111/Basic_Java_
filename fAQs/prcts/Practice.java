package prcts;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		System.out.print("Enter the Number to be rev:	");

		Scanner sc1 = new Scanner(System.in);

		int myInt = sc1.nextInt();

		sc1.close();

		int rev = 0;

		while (myInt != 0) {
			int rem = myInt % 10;
			rev = rev * 10 + rem;
			myInt = myInt / 10;
		}

		System.out.println(rev);

	}

}
