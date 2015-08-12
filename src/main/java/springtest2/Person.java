package springtest2;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements ApplicationContextAware {

	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}
	
	public void sayHi(String name) {
		System.out.println(ctx.getMessage("hello", new String[] {name}, Locale.getDefault(Locale.Category.FORMAT)));
	}

}
