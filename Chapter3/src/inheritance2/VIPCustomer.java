package inheritance2;

public class VIPCustomer extends Customer{
	protected int agentID;
	double bonusRatio;
	double salesRatio;
	
	public VIPCustomer() {
//		����ϴ� Ŭ������ ������(constructor)�� ���ٸ� super�� ����� ��������� ȣ��
//		super(0, "no-name");
//	public VIPCustomer(int customerID, String customerName) {
//		super(customerID, customerName);
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		double off = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//	}
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		double off = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	

}
