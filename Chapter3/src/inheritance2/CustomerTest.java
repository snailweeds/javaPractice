package inheritance2;

public class CustomerTest {

	public static void main(String[] args) {
		Customer a = new Customer();
		a.setCustomerName("Amanda");
		a.setCustomerID(10001);
		a.bonusPoint = 1000;
		
		System.out.println(a.showCustomerInfo());
		
		VIPCustomer b = new VIPCustomer();
		b.setCustomerName("Branden");
		b.setAgentID(10002);
		b.bonusPoint = 10000;
		System.out.println(b.showCustomerInfo());
		
		Customer c = new VIPCustomer();
//		VIPCustomer�� Customer�� ����ȯ�� �Ǿ��⿡ Customer�� �͵鸸 ��� ����
	}

}
