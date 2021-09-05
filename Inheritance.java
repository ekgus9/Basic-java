class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// Overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2) + v3; // this �ڽ� ����Ŵ
	}
}
class Cal2 extends Cal{
	// �����ڰ� �ִ� Ŭ������ ��� �޾Ҵٸ� �ݵ�� �θ� Ŭ������ ǥ��
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding
	public int sum(int v1, int v2) {
		System.out.println("o");
		return super.sum(v1, v2); // super �θ� ����Ŵ
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
