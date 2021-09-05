class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// Overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2) + v3; // this 자신 가르킴
	}
}
class Cal2 extends Cal{
	// 생성자가 있는 클래스를 상속 받았다면 반드시 부모 클래스를 표시
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding
	public int sum(int v1, int v2) {
		System.out.println("o");
		return super.sum(v1, v2); // super 부모 가르킴
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 2));
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.minus(2, 1));
		System.out.println(c2.sum(2, 1));
	}
}
