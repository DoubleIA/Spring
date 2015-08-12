package springtest1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class ChineseCollection implements Person {

	private List<String> schools;
	
	private Map scores;
	
	private Map<String, Axe> phaseAxes;
	
	private Properties health;
	
	private Set axes;
	
	private String[] books;
	
	public ChineseCollection() {
		System.out.println("Spring instance invoking bean: Chinese instance...");
	}

	public List<String> getSchools() {
		return schools;
	}

	public void setSchools(List<String> schools) {
		this.schools = schools;
	}

	public Map getScores() {
		return scores;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	public Map<String, Axe> getPhaseAxes() {
		return phaseAxes;
	}

	public void setPhaseAxes(Map<String, Axe> phaseAxes) {
		this.phaseAxes = phaseAxes;
	}

	public Properties getHealth() {
		return health;
	}

	public void setHealth(Properties health) {
		this.health = health;
	}

	public Set getAxes() {
		return axes;
	}

	public void setAxes(Set axes) {
		this.axes = axes;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}
	
	public void test() {
		System.out.println(schools);
		System.out.println(scores);
		System.out.println(phaseAxes);
		System.out.println(health);
		System.out.println(axes);
		System.out.println(java.util.Arrays.toString(books));
	}

	@Override
	public void useAxe() {
		
	}

}
