import javax.swing.JOptionPane;

public class App1 {

	public static void main(String[] args) {
		
		// 공급가와 부가세율을 입력받아 수익을 계산
		
		// value of supply
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the supply price."));
		System.out.println("supply price: " + price);
		
		// VAT
		double pvat = Double.parseDouble(JOptionPane.showInputDialog("Enter the VAT rate [ex) 0.1] ."));
		double vat = price * pvat;
		System.out.println("VAT: " + vat);
		
		// retail price
		double buyer = price + vat;
		System.out.println("retail price: " + buyer);
		
		// expense
		double expense = price * 0.3;	
		System.out.println("expense: " + expense);
		
		// income
		double income = price - expense;
		System.out.println("income: " + income);
		
		// profit dividend 5 : 3 : 2
		System.out.println("profit dividend: " + (income*0.5) +":"+ (income*0.3) +":"+ (income*0.2));
		
		
		// number conversion: refactor -> extract local variable
		
	}

}
