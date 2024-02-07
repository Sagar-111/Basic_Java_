package ch.h_exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		readFile("adssdg.txt");
	}

	private static void readFile(String path) throws FileNotFoundException{
		FileReader fr=new FileReader(path);
		
	}
}

