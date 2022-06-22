package IFpractice;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.X();
		Y yClass = mClass;
		yClass.Y();
		
		MyClass iClass = mClass;
		iClass.X();
		iClass.Y();
		iClass.myMethod();

	}

}
