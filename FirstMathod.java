
public class FirstMathod {
	
	// 공급가액 전역변수
	public static double valueOfSupply = 10000.0;
	// 부가가치세율 전역변수
	public static double vatRate = 0.1;
	// 부가가치세 전역변수
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	// 합계 전역변수
	public static double gettotal() {
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {
		
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + gettotal());

	}
}
