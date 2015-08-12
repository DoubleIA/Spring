package springaop;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloImpl implements Hello {

	@Override
	public void foo() {
		System.out.println("Executing springaop.HelloImpl.foo()...");
	}

	@Override
	public int addUser(String name, String pass) {
		System.out.println("Executing springaop.HelloImpl.addUser()..." + "name: " + name + " password: " + pass);
		if (name.length() > 3 && name.length() < 10) {
			throw new IllegalArgumentException("Name length should be longger than 3 and shortter than 10!");
		}
		return 20;
	}

}
