package overriding;

public class CustomerTest {

	public static void main(String[] args) {
		Customer a = new Customer(10001, "Amanda");
		a.bonusPoint = 1000;
		int price = a.calcPrice(1000);
		System.out.println(a.showCustomerInfo() + " 구매가:" + price);
		
		VIPCustomer b = new VIPCustomer(10002, "Branden");
		b.bonusPoint = 10000;
		price = b.calcPrice(1000);
		System.out.println(b.showCustomerInfo() + " 구매가:" + price);
		
		Customer c = new VIPCustomer(10003, "Clara");		
		System.out.println(c.showCustomerInfo() + " 구매가: " + c.calcPrice(1000));
	}

}
