package springcache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCacheTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springcache.xml");
		UserService us = ctx.getBean("userService", UserService.class);
		
		User u1 = us.getUsersByNameAndAge("Double", 21);
		User u2 = us.getAnotherUser("Double", 21);
		
		System.out.println(u1 == u2);
	}
}
