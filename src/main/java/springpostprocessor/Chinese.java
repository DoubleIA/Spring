package springpostprocessor;

import org.springframework.beans.factory.InitializingBean;

public class Chinese implements Person, InitializingBean {

	private Axe axe;
	private String name;
	
	public Chinese() {
		System.out.println("Spring invokes Chinese instance bean...");
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void setName(String name) {
		System.out.println("Spring execute setName() to complete dependency injection..." + name);
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing initial method afterPropertiesSet()...");
	}

	@Override
	public void useAxe() {
		System.out.println(name + axe.chop());
	}
	
	public void init() {
		System.out.println("Executing initial method init()...");
	}
}
