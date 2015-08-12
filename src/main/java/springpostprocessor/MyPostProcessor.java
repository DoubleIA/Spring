package springpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 * Bean post processor.
 * @param original bean
 * @param beanName
 * @return bean after processing
 * @author wangyingbo
 *
 */
public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean postprocessor after initialization. " + beanName + " is enhancing.");
		if (bean instanceof Chinese) {
			Chinese c = (Chinese)bean;
			c.setName("Double");
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean postprocessor before initialization. " + beanName + " is processing.");
		return bean;
	}

}
/*
 * BeanNameAutoProxyCreator:根据Bean实例的name属性，创建Bean实例的代理。
 * DefaultAdvisorAutoProxyCreator：根据提供的Advisor，对容器中所有Bean实例创建代理。
 */
