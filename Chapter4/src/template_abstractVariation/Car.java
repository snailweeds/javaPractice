package template_abstractVariation;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동 켜기");
	}
	
	public void turnOff() {
		System.out.println("시동 끄기");
	}
	
	public void washCar() {} // 훅 메서드 --> 하위 클래스에서 재정의해 사용
// 재정의 못하게 하기	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // 추상 매서드가 아니기에 축해도 하위 클래스에 오류 X --> 특정 클래스에만 사용 가능
		turnOff();
	}
}
