package mvn.sterio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context11 = new ClassPathXmlApplicationContext("mvn/sterio/config.xml");
		Emp ob = (Emp) context11.getBean("ob");
//		System.out.println(ob);
//		System.out.println(ob.getAddress());
		System.out.println(ob.hashCode());
		
		Emp ob2 = (Emp) context11.getBean("ob");
		System.out.println(ob2.hashCode());
		
		Beanscope bs1 =(Beanscope) context11.getBean("bean1");
		Beanscope bs2 =(Beanscope) context11.getBean("bean1");
		System.out.println(bs1.hashCode());
		System.out.println(bs2.hashCode());
	}

}
