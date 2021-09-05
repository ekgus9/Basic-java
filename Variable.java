
public class Variable {

	public static void main(String[] args) {
		
		// integer 정수
		int a = 1;
		System.out.println(a);
		
		// double 실수
		double b = 1.1;
		System.out.println(b);
		
		int e = (int) 1.1; 
		System.out.println(e); // 1 손실
		
		// string 문자
		String c = "HELLO WORLD";
		System.out.println(c);
		
		
		// uses
		String name = "ekgus";
		System.out.println("Hello, "+name+"!");
		System.out.println("hello, John!".replace("John", name));
		
		
		// int to string
		String str = Integer.toString(1);
		System.out.println(str.getClass());
		
	}

}
