package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr  = new FileReader("d:\\Harsh\\myfile.txt");
		FileOutputStream out = new FileOutputStream("d:\\Harsh\\newfile.txt");
		
		int i;
		
		while((i = fr.read()) != -1) {
			out.write(i);
		}
	}

}
