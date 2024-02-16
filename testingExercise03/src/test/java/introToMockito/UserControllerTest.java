package introToMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) //Adds the Mockito functionality we need
class UserControllerTest {
	
	@Mock
	private UserRepository userRepository;    //UserRepository is the interface that we will mock
	
	@InjectMocks
	private UserController userController;  //creates an instance of the class and injects the mocks that are created with the @Mock annotations into this instance.

	@Test
	void registerValidDetailsTest() {
		// Arrange
		User user = new User(0, "Bobby", "Codes123");  //Create an instance of a User called "user"
		User expected = new User(1, user.getUsername(), user.getPassword()); //Create an instance of User called "expected" with same name & password
		Mockito.when(userRepository.exists(user.getUsername())).thenReturn(false); //when user already exists return false
		Mockito.when(userRepository.register(user)).thenReturn(expected); //When we call register on the mock return expected
		
		// Act
		User actual = userController.register(user); //Register the user and assign assign the result to an instance of User called "actual"
		                                             //Note: The UserRepository Interface for register defines that it must return a User
		// Assert
		Assertions.assertEquals(expected, actual);   //Assert that the expected and actual results are equal
	}

	@Test                                            //Note: Default lifecycle is method
	void loginValidDetailsTest() {
		// Arrange
		User user = new User(0, "Bobby", "Codes123");  //Create a new User called user
		User expected = new User(1, user.getUsername(), user.getPassword()); //Create an instance of User called "expected" with same name & password
		Mockito.when(userRepository.login(user)).thenReturn(expected);  //When we call login on the mock return expected
		// Act
		User actual = userController.login(user); //Login the user and assign assign the result to an instance of User called "actual"
        //Note: The UserRepository Interface for register defines that it must return a User
		
		// Assert
		Assertions.assertEquals(expected, actual);  //Assert that the expected and actual results are equal
	}
}