package inheritance;

public class VIPCustomer extends Customer{
	protected int agentID;
	double bonusRatio;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		double off = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	

}
