package springtest4;

public class BeingFactory {
	public static Being getBeing(String arg) {
		if (arg.equalsIgnoreCase("dog")) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
