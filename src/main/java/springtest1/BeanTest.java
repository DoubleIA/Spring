package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
//		System.out.println(System.getProperty("java.class.path"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person p = ctx.getBean("japanese", Person.class);
		p.useAxe();
	}
}
