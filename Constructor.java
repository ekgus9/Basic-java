class print{
	public String str;
	
	public print(String str) { // ������ : class�� �̸� ���� �Ͽ� �ٷ� ����
		this.str = str; // this�� ����
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
