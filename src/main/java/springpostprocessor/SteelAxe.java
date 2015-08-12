package springpostprocessor;

public class SteelAxe implements Axe {

	public SteelAxe() {
		System.out.println("Spring invoked bean: SteelAxe");
	}
	
	@Override
	public String chop() {
		return "chop faster with steel chop";
	}

}
