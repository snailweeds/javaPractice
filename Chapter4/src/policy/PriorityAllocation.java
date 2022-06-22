package policy;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 우선순위대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("가장 숙련도 높은 상담원에게 배분합니다.");
	}

}
