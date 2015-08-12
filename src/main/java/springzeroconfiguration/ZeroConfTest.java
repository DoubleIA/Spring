package springzeroconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZeroConfTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zeroconf.xml");
		System.out.println(java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
	}
}
