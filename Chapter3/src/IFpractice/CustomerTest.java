package IFpractice;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.Buy();
		customer.sell();
		customer.sayHello();
		
		Buy buyer = customer;
		Sell seller = customer;
		
		buyer.Buy();
		seller.sell();
		
		buyer.order();
		seller.order();
	}

}
