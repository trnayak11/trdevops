package mvn.proj2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context2 = new ClassPathXmlApplicationContext("mvn/proj2/config_2.xml");
		Emp emp1 = (Emp) context2.getBean("emp");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getPhones2());
		System.out.println(emp1.getPhones2().getClass().getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getAddress().getClass().getName());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProp());
	}

}
