package springXmlSchema;

public class Chinese implements Person {
	
	private Axe axe;
	private int age;
	
	public Chinese() {
		
	}
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
		System.out.println("Age: " + age);
	}

}
