package springaop;

import org.springframework.stereotype.Component;

@Component("world")
public class WorldImpl implements World {
	
	@Override
	public void bar() {
		System.out.println("Executing springaop.World.bar()...");
	}
}
