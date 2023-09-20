package in.soundaryabavanasi.soundbricks;

import static org.junit.jupiter.api.Assertions.assertThrows;
import  in.soundaryabavanasi.soundbricks.exception.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.Set;

import org.junit.jupiter.api.Test;

import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.userservice.UserService;


public class TestgetAllUsers {
	@Test
	public void getAllUser() {
		UserService userService = new UserService();
		Set<User> arr = userService.getAll();
		System.out.println(arr);
	}
	
	
	@Test

	public void getById() {
		UserService userService = new UserService();
		User userList = userService.findById(1);
		System.out.println(userList);
	}
	
	
@Test

	public void testUpdateUser() throws Exception{
		UserService userService = new UserService();
		
		User updateUser = new User();
		
		updateUser.setFirstName("Sound");
		updateUser.setLastName("Boopathi Kannan");
		
		userService.update(1, updateUser);
		
		
	}









}
