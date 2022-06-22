package roleofthis;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("no name", 1);
		//이 이후로 name=aaa 가능 BUT 이전에는 불가능//
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
		//인스턴스의 어드레스//
		
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
