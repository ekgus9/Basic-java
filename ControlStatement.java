
public class ControlStatement {

	public static void main(String[] args) {
		
		// Boolean Data type
		System.out.println(true);
		System.out.println(false);
		
		String f = "Hello World";
		System.out.println(f.contains("H"));
		
		// Comparison Operator
		
		System.out.println("1" + "1"); // 1
		System.out.println(1 == 1); // true
		System.out.println(1 > 1); // false
		
		// Conditional Statement
		
		String ID = "ekgus9";
		String PASS = "111";
		
		if (ID.equals("ekgus9") && PASS.equals("1111")) { // 원시 데이터 타입일때만 ==
			System.out.println("LOGIN");
		} else {
			System.out.println("REJECT");
		}	
	
		// Logical Operator
		
		System.out.println(true && false); // and
		System.out.println(true || false); // or
		System.out.println(!true); // not
		
		// Looping Statement
		
		int n = 0;
		while(n < 2) {
			System.out.println(1);
			System.out.println(2);
			n++; // i = i + 1
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(0);
			System.out.println(9);
		}
			
		// Array
		
//		String users = "John, Minji, Avocado";
		String[] users = new String[3];
		users[0] = "John";
		users[1] = "Minji";
		users[2] = "Avocado";
		
		System.out.println(users[2]);
		System.out.println(users.length);
		
		int[] stu = {10,5,7};
		
		System.out.println(stu[1]);
		
		// Loop + Array
		
		String[] user = {"John", "Minji", "Avocado"};
		
		for (int i2 = 0; i2 < user.length; i2++) {
			System.out.println(" *  <li>" + user[i2] + "</li>");
		}
		
		// uses
		
		String[][] user2 = {
			{"ekgus9", "1111"},
			{"ekgus1", "2222"},
			{"ekgus2", "3333"}
		};
		String inputID = "ekgus1";
		String inputPASS = "2222";
		boolean login = false;
		
		for (int i3 = 0; i3 < user2.length; i3++) {
			if (user2[i3][0].equals(inputID) && user2[i3][1].equals(inputPASS)) {
				login = true;
				break;
			} 
		}
		if (login) {
			System.out.println("LOGIN");
		} else {
			System.out.println("REJECT");
		}
	}

}
