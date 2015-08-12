package springspel;

import java.util.List;

public class Author implements Perzon {

	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	private List<String> books;
	private Axe axe;
	
	@Override
	public void useAxe() {
		System.out.println("I am " + name + ", " + axe.chop());
	}

}
