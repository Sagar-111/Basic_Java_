package frequentlyAskedProg;

import java.util.Random;

public class L_GenerateRandomStringAndNum {

	public static void main(String[] args) {

//		Approach-1 Random class.
		Random rnd = new Random();
		
		int nextInt = rnd.nextInt(1000);
		System.out.println("Random Integer generated: "+nextInt);
		
		double nextDouble = rnd.nextDouble();
		System.out.println("Random Double generated: "+nextDouble);
		
		
//		Approach-1 Math utility class.
		double random = Math.random();
		System.out.println("Generated using Math "+random);
		
		
	}

}
