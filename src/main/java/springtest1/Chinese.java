package springtest1;

public class Chinese implements Person {

	private Axe axe;
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		System.out.println("Chinese " + axe.chop());
	}

}
