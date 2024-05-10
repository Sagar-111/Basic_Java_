package ch.e_A_Closer_Look_At_Method_And_Classes;

public class RecursionCompilation {

	public static void main(String[] args) {
		fibonacci(3, 2, 10);// took very little help of chat.
//		sumOfDigits();
		int powerOfNumber = powerOfNumber(3, 5);

		System.out.println("Power of a given number is : " + powerOfNumber);

	}

	private static int powerOfNumber(int number, int degree) {

		int power = number;

		if (degree == 1)
			return power;

		power = power * powerOfNumber(power, degree - 1);

		return power;
	}

	public static int fibonacci(int firstTerm, int firstIncr, int countOfTerm) {

		if (countOfTerm <= 0) {
			return firstTerm;
		}

		System.out.print(firstTerm + " ");

		return fibonacci(firstTerm + firstIncr, firstTerm, countOfTerm - 1);
	}

}
