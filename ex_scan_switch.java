import java.util.Scanner;

public class ex_scan_switch {

	public static void main(String[] args) {
		
		// scanner
		
//		Scanner s = new Scanner(System.in);
//		while (true) {
//			String name = s.next();
//			System.out.println("name: " + name);
//			
//			if(name.equals("ekgus9")) {
//				System.out.println("Hello");
//				break;
//			}
//		}
//		s.close();
		
		// switch
		
		System.out.println("�޴��� �Է��ϼ���!");
		Scanner s2 = new Scanner(System.in);
		String menu = s2.next();
		int price = 0;
		
		switch(menu) {
		case "�Ľ�Ÿ":
			price = 15000; break;
		case "����":
			price = 5000; break;
		case "���":
			price = 3500; break;
		default:
			System.out.println("error");
		}
		
		if (price != 0) {
			System.out.println("price: "+ price);
		}
		
		s2.close();
		
	}
}

// Scanner�� �� �� �����ϸ� �ȵ�
// ���ϸ��� scanner���� ������