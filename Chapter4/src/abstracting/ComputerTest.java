package abstracting;

public class ComputerTest {

	public static void main(String[] args) {
		DeskTop desktop = new DeskTop();
		Computer computer = new DeskTop();
		//추상 클래스는 인스턴스화 X --> new X , 상속만을 하기 위한 class
//		Computer computer = new Computer(); X
	}

}
