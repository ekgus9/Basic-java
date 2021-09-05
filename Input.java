import javax.swing.JOptionPane;

public class Input {
	
	public static void main(String[] args) {
		
		//popup input text swing
		String name = JOptionPane.showInputDialog("Enter your name");
		System.out.println(name);
		
		
		// run -> run configurations -> arguments
		// args -> parameter 매개변수
		String name2 = args[0];
		System.out.println(name2);
		
	}

}
