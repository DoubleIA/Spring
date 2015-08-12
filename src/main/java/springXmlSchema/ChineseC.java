package springXmlSchema;

public class ChineseC implements Person {

	private int age;
	
	private Axe axe;
	
	public ChineseC(int age, Axe axe) {
		this.age = age;
		this.axe = axe;
	}
	
	@Override
	public void useAxe() {
		System.out.println("ChineseC: " + axe.chop());
		System.out.println("ChineseC age: " + age);
	}

}
