package springtest3;

public class ChineseConfig implements Person {
	private Axe axe;
	
	private String name;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void useAxe() {
		System.out.println("I am: " + name + axe.chop());
	}
	
}
