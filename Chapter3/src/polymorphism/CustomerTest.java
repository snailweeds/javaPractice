package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerA = new Customer(10010, "Alice");
		Customer customerB = new Customer(10020, "Bread");
		Customer customerC = new GoldCustomer(10030, "Clark");
		Customer customerD = new GoldCustomer(10040, "Dazy");
		Customer customerE = new VIPCustomer(10050, "Elliot");
		
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
		    System.out.println(customer.customerName + "님 지불완료: " + cost + "원, " + customer.customerName + "님 보너스 포인트: " + customer.bonusPoint);
		}
	}

}
