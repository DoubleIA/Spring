package springtest1;

import org.springframework.beans.factory.BeanNameAware;


/**
 * 
 * Need to implement BeanNameAware to get bean id
 * @author wangyingbo
 *
 */
public class ChineseBeanId implements BeanNameAware {

	private String beanName;
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void info() {
		System.out.println("Chinese instanced class deploies the bean id as " + beanName);
	}

}
