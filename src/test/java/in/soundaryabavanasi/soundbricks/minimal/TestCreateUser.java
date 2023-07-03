package in.soundaryabavanasi.soundbricks.minimal;
import in.soundaryabavanasi.soundbricks.*;

import in.soundaryabavanasi.soundbricks.userservice.UserService;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class TestCreateUser{

	@Test
	
	public void testCreateUserWithValidataInput() {
		
	 UserService userservice = new UserService();
			User newUser = new User();
			newUser.setId(11);
			newUser.setEmail("sound@gmail.com");
			newUser.setFirstname("soundarya");
			newUser.setLastname("reddy");
			newUser.setActive(true);
			newUser.setPassword("sound@45");
			
          assertDoesNotThrow(()->{
    	  userservice.create(newUser);
    	  userservice.getAll();
      });
          @Test 
          public void testCreateUserWithInvalidataInput() {
			UserService userService = new UserService();
			Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
	
			
			
	});
			string exceptedMessage = "Invalid user input";
			string actualMessage = exception.getMessage();
			asserttrue(exceptedMessage.equals(actualMessage));
          			
}
          @Test
          public void testUserWithEmailEmpty(){
        	  
        	  
          }
	}
	
