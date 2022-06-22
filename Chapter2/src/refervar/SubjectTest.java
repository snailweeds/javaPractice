package refervar;

public class SubjectTest {

	public static void main(String[] args) {
		Student Me = new Student(2017, "이욘지");
		Me.setKoreaSubject("국어", 76);
		Me.setMathSubject("수학", 94);
		
		Student You = new Student(2017, "박천재");
		You.setKoreaSubject("국어", 100);
		You.setMathSubject("수학", 100);
		
		
		Me.showScore();
		You.showScore();		
	}

}
