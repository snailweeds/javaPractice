package template_abstractVariation;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ� �ѱ�");
	}
	
	public void turnOff() {
		System.out.println("�õ� ����");
	}
	
	public void washCar() {} // �� �޼��� --> ���� Ŭ�������� �������� ���
// ������ ���ϰ� �ϱ�	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // �߻� �ż��尡 �ƴϱ⿡ ���ص� ���� Ŭ������ ���� X --> Ư�� Ŭ�������� ��� ����
		turnOff();
	}
}
