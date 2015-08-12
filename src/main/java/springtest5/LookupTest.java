package springtest5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lookup.xml");
		Person p1 = ctx.getBean("chinese", Person.class);
		Person p2 = ctx.getBean("chinese", Person.class);
		System.out.println(p1 == p2);
		p1.hunt();
		p1.hunt();
		p2.hunt();
	}
}
