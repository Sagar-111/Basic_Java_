package prcts;

public class Practice {

	static {
		System.out.println("Static bloc");
	};

	public static void main(String[] args) {

		int[] arr = { 11, 14, 8, 5, 9, 20 };

		display(arr);
		System.out.println(" ");
		for (int j = 0; j < arr.length - 1; j++) {
			
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {//14 8
					int temp = arr[i];//8
					arr[i] = arr[i + 1];//8
					arr[i + 1] = temp;//
				}

			}
		}
		display(arr);

	}

	static void display(int[] array) {
		System.out.print("The Array is===>[ ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");

		System.out.println(" ");

	}

}
