package springcache;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("userService")
@Cacheable(value="users")
public class UserServiceImpl implements UserService {

	Logger logger = Logger.getLogger(getClass());
	
	@Override
	public User getUsersByNameAndAge(String name, int age) {
		logger.info("Executing findUsersByNameAndAge() query method...");
		return new User(name, age);
	}

	@Override
	public User getAnotherUser(String name, int age) {
		logger.info("Executing findAnotherUser() query method...");
		return new User(name, age);
	}

}
