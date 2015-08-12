package springtest3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Value("Double") String personName;
	
	@Bean(name="chineseConfig")
	public Person person() {
		ChineseConfig cc = new ChineseConfig();
		cc.setAxe(stoneAxe());
		cc.setName(personName);
		return cc;
	}
	
	@Bean(name="stoneAxe")
	public Axe stoneAxe() {
		return new StoneAxe();
	}
	
	@Bean(name="steelAxe()")
	public Axe steelAxe() {
		return new SteelAxe();
	}
	
	
}
