package mvn.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	
	public static void main(String[] args) {
		ApplicationContext context12 = new ClassPathXmlApplicationContext("mvn/spel/config.xml");
		
		Teacher t = context12.getBean("teacher", Teacher.class);
		System.out.println(t);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("23+34");
		System.out.println(expression.getValue());
	}

}
