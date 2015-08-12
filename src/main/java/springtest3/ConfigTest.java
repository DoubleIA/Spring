package springtest3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ChineseConfig cc = ctx.getBean("chineseConfig", ChineseConfig.class);
		cc.useAxe();
	}

}