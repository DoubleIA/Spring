package springXmlSchema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("schema.xml");
		Chinese c = ctx.getBean("chinese", Chinese.class);
		c.useAxe();
		ChineseC cc = ctx.getBean("chineseC", ChineseC.class);
		cc.useAxe();
		ChineseU cu = ctx.getBean("chineseU", ChineseU.class);
		cu.useAxe();
	}
}
