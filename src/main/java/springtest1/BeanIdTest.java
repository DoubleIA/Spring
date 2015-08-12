package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanIdTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ChineseBeanId chin = ctx.getBean("chin", ChineseBeanId.class);
		chin.info();
	}
}
