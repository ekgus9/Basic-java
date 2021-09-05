class print{
	public String delimiter;
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}

public class OOP {
	
	public static void main(String[] args) {
		
		print p1 = new print(); // class -> instance -> remove static 
		p1.delimiter = "-";
		p1.A();
		
		print p2 = new print();
		p2.delimiter = "+";
		p2.B();
		
	}
	
}
