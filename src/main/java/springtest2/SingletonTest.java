package springtest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(ctx.getBean("person") == ctx.getBean("person"));
		System.out.println(ctx.getBean("person2") == ctx.getBean("person2"));
		System.out.println(ctx.getBean("date"));
		Thread.sleep(1000);
		System.out.println(ctx.getBean("date"));
	}
}
