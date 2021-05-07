package mvn.proj6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context6 = new ClassPathXmlApplicationContext("mvn/proj6/config.xml");
		Colddrink cd = (Colddrink )context6.getBean("cd");
		System.out.println(cd);
		context6.registerShutdownHook();
	}
}
