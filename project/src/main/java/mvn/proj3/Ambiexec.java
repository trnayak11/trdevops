package mvn.proj3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ambiexec {

	public static void main(String[] args) {
		ApplicationContext context5 = new ClassPathXmlApplicationContext("mvn/proj3/config_3.xml");
		Ambi amb = (Ambi) context5.getBean("ambi");
		amb.display();
	}

}
