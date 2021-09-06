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
		
		System.out.println("메뉴를 입력하세요!");
		Scanner s2 = new Scanner(System.in);
		String menu = s2.next();
		int price = 0;
		
		switch(menu) {
		case "파스타":
			price = 15000; break;
		case "고구마":
			price = 5000; break;
		case "라면":
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

// Scanner은 두 번 실행하면 안됨
// 파일명이 scanner여도 오류남