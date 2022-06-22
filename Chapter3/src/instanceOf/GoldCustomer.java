package instanceOf;

public class GoldCustomer extends Customer{
	double salesRatio;
	
	public GoldCustomer(int CustomerID, String CustomerName) {
		super(CustomerID, CustomerName);
		
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= (int)(price*salesRatio);
		return price;
	}
}
