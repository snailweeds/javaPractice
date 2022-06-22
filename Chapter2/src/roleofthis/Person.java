package roleofthis;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("no name", 1);
		//�� ���ķ� name=aaa ���� BUT �������� �Ұ���//
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		//�ν��Ͻ��� ��巹��//
		
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
