package template_abstractVariation;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("�������� ���� ��");
		System.out.println("��� ������ ��");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ ��� ��");		
	}

	@Override
	public void wiper() {
		System.out.println("������ �ѱ�");		
	}

}
