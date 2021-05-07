package mvn.proj4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context4 = new ClassPathXmlApplicationContext("mvn/proj4/config_4.xml");
		Ref1 r1 = (Ref1) context4.getBean("ref1");
		System.out.println(r1.getX());
	}

}
