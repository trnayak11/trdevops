package mvn.proj7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context7 = new ClassPathXmlApplicationContext("mvn/proj7/config.xml");
		Anno anno = (Anno) context7.getBean("anno");
		System.out.println(anno);
		context7.registerShutdownHook();
	}

}
