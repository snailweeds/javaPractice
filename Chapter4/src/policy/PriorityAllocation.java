package policy;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� �켱������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ� ���� �������� ����մϴ�.");
	}

}
