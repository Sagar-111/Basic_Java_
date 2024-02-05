package frequentlyAskedProg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZC_FileWritter {

	public static void main(String[] args) throws IOException{

		FileWriter file = new FileWriter("C:\\Users\\sgrch\\OneDrive\\Desktop\\NewFile.txt");
		
		BufferedWriter bw = new BufferedWriter(file);
		
		bw.write("The first line entered to the file.");
		bw.write("\nUse java's escape sequensec to write in a file but you don't need to write easy in java.");
		bw.write("\nYou just have to write data to the file by means of code");
		bw.write("\nFinished writting in the files");
		bw.write("\n");
		bw.write("\nUnless you close the BufferedWriter the file will not get created or modified.");
		
		bw.close();
		
	}

}
