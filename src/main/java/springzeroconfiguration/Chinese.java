package springzeroconfiguration;

import org.springframework.stereotype.Component;

import springcommon.Axe;
import springcommon.Person;

@Component
public class Chinese implements Person {

	private Axe axe;
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
