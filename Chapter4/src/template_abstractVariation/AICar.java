package template_abstractVariation;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("�������� ��");
		System.out.println("�ڵ����� �ڵ����� ������ �ٲٴ� ��");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� ���� �� �ڵ� ����");		
	}

	@Override
	public void wiper() {
		System.out.println("�� ���� �� ������ �۵�");		
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ����...");
		}
	
	

}
