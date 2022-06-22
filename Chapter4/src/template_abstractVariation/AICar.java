package template_abstractVariation;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행 중");
		System.out.println("자동차가 자동으로 방향을 바꾸는 중");
	}

	@Override
	public void stop() {
		System.out.println("장애물 감지 후 자동 정지");		
	}

	@Override
	public void wiper() {
		System.out.println("비 감지 후 와이퍼 작동");		
	}

	@Override
	public void washCar() {
		System.out.println("자동 세차...");
		}
	
	

}
