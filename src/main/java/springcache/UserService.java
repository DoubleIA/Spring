package springcache;

public interface UserService {
	
	public User getUsersByNameAndAge(String name, int age);

	public User getAnotherUser(String name, int age);
	
}
