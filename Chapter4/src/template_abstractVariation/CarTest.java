package template_abstractVariation;

public class CarTest {

	public static void main(String[] args) {
		AICar ai = new AICar();
		ManualCar manual = new ManualCar();
		
		ai.run();
		System.out.println("--------------------");
		manual.run();
	}

}
