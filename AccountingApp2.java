class accounting{
	public double valueOfSupply; // ���ް���
	
	public accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
    public static double vatRate = 0.1; // �ΰ���ġ���� // ����
 
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp2 {
    
    public static void main(String[] args) {
    	
    	accounting acc1 = new accounting(10000.0);
    	accounting acc2 = new accounting(20000.0);

        System.out.println("Value of supply : " + acc2.valueOfSupply);
        System.out.println("VAT : " + acc1.getVAT());
        System.out.println("Total : " + acc2.getTotal());
 
    }
 
}