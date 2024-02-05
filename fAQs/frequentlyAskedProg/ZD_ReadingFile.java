package frequentlyAskedProg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZD_ReadingFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {

//		Approach_1
		FileReader fileToRead = new FileReader("C:\\Users\\sgrch\\OneDrive\\Desktop\\NewFile.txt");

		BufferedReader br = new BufferedReader(fileToRead);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		br.close();

//		Approach_2

		File file = new File("C:\\Users\\sgrch\\OneDrive\\Desktop\\NewFile.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
//		OR
		
//		sc.useDelimiter("\\Z");
//		System.out.println(sc.next());
		sc.close();
	}

}
