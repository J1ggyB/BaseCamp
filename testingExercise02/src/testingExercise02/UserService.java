package testingExercise02;
import java.util.HashMap;
import java.util.Map;

public class UserService {

	private Map<String, String> users;
	
	public UserService() {
		this.users = new HashMap<>();   // Map is an interface in Java it contains key & value pairs
		                                //the HashMap extends Map is non indexed and can take null. 
	                                    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html
		// Common HashMap methods: put(K,V), containsKey(Obj key), remove(Obj key), size(), get(Obj key)
	}
	
	public String register(String username, String password) {
		// username must not be null or empty
		if (username == null) throw new IllegalArgumentException("Username must not be null"); //throw exception if username is null
		String trimmedUsername = username.trim();  //trim white space from username and assign to String trimmedUserName
		if (trimmedUsername.isEmpty()) throw new IllegalArgumentException("Username must not be whitespace only");//throw exception if trimmedUserName is empty String
		
		// password must not be null or empty
		if (password == null) throw new IllegalArgumentException("Password must not be null");
		String trimmedPassword = password.trim();
		if (trimmedPassword.isEmpty()) throw new IllegalArgumentException("Password must not be whitespace only");

		// username must be at least 4 characters
		if (trimmedUsername.length() < 4) throw new IllegalArgumentException("Username must contain at least 4 characters");
		
		// username must be unique
		if (users.get(trimmedUsername) != null) throw new IllegalArgumentException("Username already exists");
		
		// password must be at least 6 characters
		if (trimmedPassword.length() < 6) throw new IllegalArgumentException("Password must contain at least 6 characters");

		// password must contain at least 1 uppercase character
		if (!trimmedPassword.matches("[A-Z|a-z|1-9]*[A-Z]+[A-Z|a-z|1-9]*")) throw new IllegalArgumentException("Password must contain at least 1 uppercase character");
		
		// password must contain at least 1 lowercase character
		if (!trimmedPassword.matches("[A-Z|a-z|1-9]*[a-z]+[A-Z|a-z|1-9]*")) throw new IllegalArgumentException("Password must contain at least 1 lowercase character");
		
		// password must contain at least 1 number
		if (!trimmedPassword.matches("[A-Z|a-z|1-9]*[1-9]+[A-Z|a-z|1-9]*")) throw new IllegalArgumentException("Password must contain at least 1 number character");
		
		// add user to map
		users.put(trimmedUsername, trimmedPassword);  // Here we add the the new key/value pair
		// for a user to our "users" HashMap
		return trimmedUsername;   // This is the value returned from register()
	}

	public String login(String username, String password) {
		// username and password must not be null
		if (username == null || password == null) throw new IllegalArgumentException("Username and password must not be null");
		String trimmedUsername = username.trim();
		String trimmedPassword = password.trim();
		
		// username and password must not be empty
		if (trimmedUsername.isEmpty() || trimmedPassword.isEmpty()) throw new IllegalArgumentException("Username and password must not be empty");
		
		String savedPassword = users.get(trimmedUsername);   //Retrieve the value of password where the HashMap key matches trimmedUserName
		if (savedPassword == null) throw new RuntimeException("Invalid username supplied");
		
		if (!trimmedPassword.equals(savedPassword)) throw new IllegalArgumentException("Invalid password supplied");
		
		return username; //return from login
	}
}
//****HELP WITH REGEX
//[]  [Find one character from the options between the brackets]
//[A-Z|a-z|1-9]  The | bar is "or" 
//[A-Z|a-z|1-9]*  n* Matches any string that zero or more occurrences of n
//[A-Z|a-z|1-9]*[A-Z]+   n+ Matches any string that contains at least one [A-Z] ie: Password must contain at least 1 uppercase character" 
//[A-Z|a-z|1-9]*[A-Z]+[A-Z|a-z|1-9]*   Last bit [A-Z|a-z|1-9]*  The * indicates - that it Matches any string that zero or more occurrences of n
//Think of the n* as being exclusive [abc]* can have zero or many lowercase alphabetical characters


