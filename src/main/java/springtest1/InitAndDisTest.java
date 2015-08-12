package springtest1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDisTest {

	public static void main(String[] args) {
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		ChineseInitExIB ib = cxt.getBean("chineseInit", ChineseInitExIB.class);
		ib.useAxe();
		ChineseDisB db = cxt.getBean("chineseDis", ChineseDisB.class);
		db.useAxe();
		cxt.close();
	}
	
}
