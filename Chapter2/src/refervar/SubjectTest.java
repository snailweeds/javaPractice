package refervar;

public class SubjectTest {

	public static void main(String[] args) {
		Student Me = new Student(2017, "�̿���");
		Me.setKoreaSubject("����", 76);
		Me.setMathSubject("����", 94);
		
		Student You = new Student(2017, "��õ��");
		You.setKoreaSubject("����", 100);
		You.setMathSubject("����", 100);
		
		
		Me.showScore();
		You.showScore();		
	}

}
