package policy;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ��Ⱑ ���� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��Ⱑ ���� ���� �������� ����մϴ�.");
	}

}
