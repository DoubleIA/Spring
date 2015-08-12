package springtest1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ChineseInitExIB implements Person, InitializingBean, BeanNameAware, ApplicationContextAware {

	private Axe axe;
	
	public void setAxe(Axe axe) {
		System.out.println("Spring invokes setAxe() to execute dependency injection");
		this.axe = axe;
	}
	
	public ChineseInitExIB() {
		System.out.println("Spring invoking bean: ChineseInitExIB");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Execute initializing method afterPropertiesSet...");
	}

	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("===setApplicationContext===");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("===setBeanName===");
	}
	
	public void init() {
		System.out.println("Execute initializing method init...");
	}

}
