package springtest6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetterTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("getter.xml");
		System.out.println("Son1: " + ctx.getBean("son1", Son.class).getAge());
		System.out.println("Son2: " + ctx.getBean("son1", Son.class).getAge());
		System.out.println("Age1: " + ctx.getBean("theAge"));
		System.out.println("Age2: " + ctx.getBean("theAge2"));
		System.out.println("Age3: " + ctx.getBean("theAge3"));
		
		//Get field test
		System.out.println("Age4: " + ctx.getBean("theAge4"));
		System.out.println("Son: " + ctx.getBean("son", Son.class).getAge());
	}
}
