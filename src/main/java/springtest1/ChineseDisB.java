package springtest1;

import org.springframework.beans.factory.DisposableBean;

public class ChineseDisB implements Person, DisposableBean{

	private Axe axe;
	
	public ChineseDisB() {
		System.out.println("Spring invoking bean: ChineseDisB");
	}
	
	public void setAxe(Axe axe) {
		System.out.println("Spring executes dependency injection: setAxe()");
		this.axe = axe;
	}
	
	public void close() {
		System.out.println("Executing disposable method close...");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Executing disposable method destroy");
	}

	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
