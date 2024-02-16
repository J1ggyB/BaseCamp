package introToMockito;

public interface UserRepository {           //This would be the customer/alt-dev teams interface not yet implemented

	public boolean exists(String trimmedUsername);

	public User register(User user);

	public User login(User user);

}
