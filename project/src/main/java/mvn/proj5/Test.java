package mvn.proj5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void println(Object line) {
	    System.out.println(line);
	}
	public static void main(String[] args) {
		AbstractApplicationContext context5 = new ClassPathXmlApplicationContext("mvn/proj5/config.xml");
		Life life = (Life) context5.getBean("life");
		println(life);
		context5.registerShutdownHook();
	}

}
