package springcommon;

import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {
	
	public StoneAxe() {
		System.out.println("Spring invoked bean: SteelAxe");
	}

	@Override
	public String chop() {
		return "chop with stone chop";
	}

}
