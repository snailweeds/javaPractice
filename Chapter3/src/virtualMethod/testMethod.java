package virtualMethod;

public class testMethod {
	int num;
	
	void aaa() {
		System.out.println("aaa() ȣ��");
	}

	public static void main(String[] args) {
		testMethod a1 = new testMethod();
		a1.aaa();
		
		testMethod a2 = new testMethod();
		a2.aaa();
	}

}
