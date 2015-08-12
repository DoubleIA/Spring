package springpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Spring invokes Chinese instance bean...
//Spring invoked bean: SteelAxe
//Bean postprocessor before initialization.steelAxe is processing.
//Bean postprocessor after initialization.steelAxe is processing.
//Spring execute setName() to complete dependency injection...
//Bean postprocessor before initialization.chinese is processing.
//Executing initial method afterPropertiesSet()...
//Executing initial method init()...
//Bean postprocessor after initialization.chinese is processing.
//Spring execute setName() to complete dependency injection...
//Doublechop faster with steel chop

public class MyPostProcessorTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("postprocessor.xml");
		Person p = (Person)ctx.getBean("chinese");
		p.useAxe();
		
		
		System.out.println("Using bean factory.==============================================");
		Resource isr = new ClassPathResource("postprocessor.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(isr);
		BeanPostProcessor bp = (BeanPostProcessor)beanFactory.getBean("bp");
		beanFactory.addBeanPostProcessor(bp);
		Person p1 = (Person)beanFactory.getBean("chinese");
		p1.useAxe();
		
	}
}
