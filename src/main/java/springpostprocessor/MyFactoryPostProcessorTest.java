package springpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFactoryPostProcessorTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("postprocessor.xml");
		Person p = (Person)ctx.getBean("chinese");
		p.useAxe();
	}
}
