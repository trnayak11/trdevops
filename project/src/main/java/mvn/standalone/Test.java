package mvn.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context10 = new ClassPathXmlApplicationContext("mvn/standalone/config_2.xml");
		Person p = (Person) context10.getBean("person");
		System.out.println(p);
		//System.out.println(p.getName().getClass().getName());
	}

}
