package springtest5;

public abstract class Chinese implements Person{
	private Dog dog;
	
	public abstract Dog getDog();
	
	@Override
	public void hunt() {
		System.out.println("I'm taking " + getDog() + "for hunting.");
		System.out.println(getDog().run());	
	}
}
