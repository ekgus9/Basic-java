import java.io.FileWriter;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) {
		
		// try ~ catch
		
		int[] score = {1,2,3};
		
		try {
			System.out.println(2/0);
			System.out.println(score[3]);
		} catch(ArithmeticException e) {
			System.out.println("error1"+e.getMessage());
			e.printStackTrace(); // error message
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error2");
		}
		
		// checked exception
		
		FileWriter f = null;
		
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// try with resource statements
		
		try(FileWriter f1 = new FileWriter("data1.txt")){
			f1.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// my exception
		
		throw new RuntimeException("error");
		
	}
}
