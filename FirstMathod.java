
public class FirstMathod {
	
	// ���ް��� ��������
	public static double valueOfSupply = 10000.0;
	// �ΰ���ġ���� ��������
	public static double vatRate = 0.1;
	// �ΰ���ġ�� ��������
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	// �հ� ��������
	public static double gettotal() {
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {
		
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + gettotal());

	}
}