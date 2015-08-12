package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @description Aspect Orient Programming
 * @author wangyingbo
 *
 */
public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspectj.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.foo();
		hello.addUser("Double", "dabo");
		World world = (World) ctx.getBean("world"); 
		world.bar();
	}
}
