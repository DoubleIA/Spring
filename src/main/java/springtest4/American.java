package springtest4;

public class American implements Person {

	@Override
	public String sayHello(String name) {
		return "Hello! " + name;
	}

	@Override
	public String sayGoodBye(String name) {
		return "Godd Bye! " + name;
	}

}
