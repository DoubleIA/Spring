package springXmlSchema;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChineseU implements Person {

	private int age;
	
	private List schools;
	
	private Map scores;
	
	private Set axes;
	
	private Axe axe;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSchools(List schools) {
		this.schools = schools;
	}
	
	public void setScores(Map scores) {
		this.scores = scores;
	}
	
	public void setAxes(Set axes) {
		this.axes = axes;
	}
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		System.out.println(axe.chop());
		System.out.println("Age: " + age);
		System.out.println(schools);
		System.out.println(scores);
		System.out.println(axes);
	}

}
