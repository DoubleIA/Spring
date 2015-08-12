package springtest2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent)event;
			System.out.println("Receive address: " + emailEvent.getAddress());
			System.out.println("Context: " + emailEvent.getText());
		} else {
			System.out.println("Others: " + event);
		}
	}


}
