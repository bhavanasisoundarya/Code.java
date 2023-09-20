package in.soundaryabavanasi.soundbricks;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		
		
		newUser.setEmailId("sound@gmail.com");
		newUser.setPassword("sound@12");
		
		assertDoesNotThrow(()->{
			userService.create(newUser);
		});
	
	}
	
	private void setEmailId(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testCreateUserWithInvalidInput(){
		
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(null);
		});
		String exceptedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test 
	public void testCreateUserWithEmailNull() throws Exception {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setUserId(3);
		newUser.setFirstName("sandhya");
		newUser.setLastName("Boopathy");
		newUser.setEmailId(null);
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test 
	public void testCreateUserWithEmailEmpty() throws Exception {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setUserId(3);
		newUser.setFirstName("soundarya");
		newUser.setLastName("Boopathy");
		newUser.setEmailId("");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithPasswordNull() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setUserId(1);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmailId("sandhya@gmail.com");
		newUser.setPassword(null);
		newUser.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithPasswordEmpty() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setUserId(1);
		newUser.setFirstName("sandhya");
		newUser.setLastName("Boopathy");
		newUser.setEmailId("sindhu@gmail.com");
		newUser.setPassword("");
		newUser.setActive(true);

		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithFirstNameNull() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setUserId(1);
		newUser.setFirstName(null);
		newUser.setLastName("setty");
		newUser.setEmailId("setty@gmail.com");
		newUser.setPassword("set4849");
		newUser.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "FirstName cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithFirstNameEmpty() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setUserId(1);
		newUser.setFirstName("saranya");
		newUser.setLastName("reddy");
		newUser.setEmailId("saranya@gmail.com");
		newUser.setPassword("Uthra4849");
		newUser.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "FirstName cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

}