package mvn.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context8 = new ClassPathXmlApplicationContext("mvn/autowiring/config.xml");
		Emp emp = (Emp) context8.getBean("emp");
		//Emp emp = context8.getBean("emp",Emp.class);
		System.out.println(emp);
	}

}
