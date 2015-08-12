package springtest5;

public class GunDog implements Dog {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String run() {
		return "I'm dog " + name + ", runing fast.";
	}
	
}
