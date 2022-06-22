package IFpractice;

public class Customer implements Buy, Sell{

	@Override
	public void Buy() {
		System.out.println("Customer Buy");
	}
	
	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

}
