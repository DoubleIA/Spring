package springtest4;

public class Dog implements Being {

	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void testBeing() {
		System.out.println(msg + ", dogs like bones");
	}

}
