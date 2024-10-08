package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		//File file = new File("d:\\Harsh\\myfile.txt");
		
		//FileReader fr  = new FileReader(file);
		FileReader fr  = new FileReader("d:\\Harsh\\myfile.txt");
		
		BufferedReader br = new BufferedReader(fr, 200);
		//200: number of character to read			obj
		//read 200 character at a time
		
		String str;
		while((str = br.readLine())!= null) {
			System.out.println(str);
		}
		br.close();
	}

}
