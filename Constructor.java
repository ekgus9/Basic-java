class print{
	public String str;
	
	public print(String str) { // 생성자 : class와 이름 같게 하여 바로 실행
		this.str = str; // this로 구분
	}
	
	public void A() {
		System.out.println(this.str);
		System.out.println("A");
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		print a = new print("hello wolrd");
		a.A();

	}

}
