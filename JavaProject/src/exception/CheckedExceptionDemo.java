package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream("d:\\Harsh\\myfile.txt");
			int k;
			while((k = fis.read()) != -1) {
				System.out.print((char)k);
			}
			fis.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error: path is wrong for the file, check the path");
			System.out.println(e.hashCode());
		}

	}

}