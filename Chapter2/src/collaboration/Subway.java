package collaboration;

public class Subway {
	int subwayNum;
	int passengerCount;
	int money;
	
	public Subway(int busNum) {
		this.subwayNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNum + "역의 승객 수는 " + passengerCount + "명 이고, 수입인 " + money + "원 입니다.");
	}

}
