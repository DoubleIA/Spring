package springtest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmailEvent ele = new EmailEvent("test", "event_test@springtest2.com", "this is a test");
		ctx.publishEvent(ele);
		Person p = ctx.getBean("person", Person.class);
		p.sayHi("Monkey");
		ExampleBean eb = ctx.getBean("exampleBean", ExampleBean.class);
		System.out.println("integer field: " + eb.getIntegerField() + ", double field: " + eb.getDoubleField());
	}
}
