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
		newUser.setId(3);
		newUser.setFirstname("Soundarya");
		newUser.setFirstname("Bavanasi");
		newUser.setEmail("sound@gmail.com");
		newUser.setPassword("sound@12");
		newUser.setActive(true);

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});

	}

	@Test
	public void testCreateUserWithInvalidInput() throws Exception {

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
		newUser.setId(3);
		newUser.setFirstname("soundarya");
		newUser.setFirstname("Bavanasi");
		newUser.setEmail(null);
		newUser.setPassword("sound@12");
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
		newUser.setId(3);
		newUser.setFirstname("soundarya");
		newUser.setFirstname("Bavanasi");
		newUser.setEmail("");
		newUser.setPassword("sound@12");
		newUser.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(exceptedMessage.equals(actualMessage));
	}
}