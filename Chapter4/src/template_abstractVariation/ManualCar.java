package template_abstractVariation;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("수동으로 운행 중");
		System.out.println("헨들 돌리는 중");
	}

	@Override
	public void stop() {
		System.out.println("브레이크 밟는 중");		
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼 켜기");		
	}

}
