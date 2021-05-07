package mvn.proj3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mvn.proj2.Emp;
public class Testcheck {

	public static void main(String[] args) {
		ApplicationContext context3 = new ClassPathXmlApplicationContext("mvn/proj3/config_3.xml");
		Test3 t = (Test3) context3.getBean("test3");
		System.out.println(t);
		
	}

}
