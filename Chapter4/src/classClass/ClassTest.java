package classClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, 
	IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("classClass.Person"); // 패키지 이름.class 이름
		
		Person person = (Person)c1.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		Person kim2 = new Person("Kim");
	}

}
