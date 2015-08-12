package springpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("程序对Spring所做的BeanFactory的初始化没有改变...");
		System.out.println("Spring容器是：" + beanFactory);
	}

}
/*
 * PropertyPlaceholderConfigurer: 属性占位符配置器
 * PropertyOverrideConfigurer: 重写占位符配置器
 * CustomAutowireConfigurer: 自定义自动装配的配置器
 * CustomScopeConfigurer: 自定义作用域的配置器
 */
