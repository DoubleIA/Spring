package springtest1;

public class Japanese implements Person {

	private Axe axe;
	
	public Japanese(Axe axe) {
		this.axe = axe;
	}
	
	@Override
	public void useAxe() {
		System.out.println("Japanese " + axe.chop());
	}

}
