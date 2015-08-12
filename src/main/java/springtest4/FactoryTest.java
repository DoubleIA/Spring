package springtest4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("factory.xml");
		Being b1 = ctx.getBean("dog", Being.class);
		b1.testBeing();
		Being b2 = ctx.getBean("cat", Being.class);
		b2.testBeing();
		
		Person p1 = ctx.getBean("chinese", Person.class);
		System.out.println(p1.sayHello("Double"));
		System.out.println(p1.sayGoodBye("Double"));
		Person p2 = ctx.getBean("american", Person.class);
		System.out.println(p2.sayHello("Blues"));
		System.out.println(p2.sayGoodBye("Blues"));
		System.out.println("ok");
		
		System.out.println(ctx.getBean("north"));
		System.out.println(ctx.getBean("theValue"));
		System.out.println(ctx.getBean("&theValue"));
	}
}
