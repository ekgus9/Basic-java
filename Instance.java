import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Instance {

	public static void main(String[] args) throws FileNotFoundException {

		//class
		System.out.println(Math.PI); 
		
		// instance
		PrintWriter p = new PrintWriter("result.txt");
		p.write("HELLO");
		p.close();
		
		
		//inheritance 상속
		//Object -> Writer -> PrintWriter
		
		
	}

}
