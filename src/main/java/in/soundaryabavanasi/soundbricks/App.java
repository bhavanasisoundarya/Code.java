package in.soundaryabavanasi.soundbricks;

import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class App {
	public static void main(String[] args) {
		
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstname("Uthra");
		newUser.setLastname("Boopathy");
		newUser.setEmail("uthra@gmail.com");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		UserService userService;
		
		try {
			userService = new UserService();
			User newUser1 = new User();
			newUser1.setId(2);
			newUser1.setFirstname("Ramya");
			newUser1.setLastname("Boopathy");
			newUser1.setEmail("ramys@gmail.com");
			newUser1.setPassword("Uthra@12");
			newUser1.setActive(true);
			
			userService.create(newUser);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
//		userService.create(newUser1);
		
		User updateUser = new User();
		updateUser.setId(2);
		updateUser.setFirstname("Ramya");
		updateUser.setLastname("Boopathy");
		updateUser.setEmail("ramys@gmail.com");
		updateUser.setPassword("Uthra@12");
		updateUser.setActive(true);
		
		
//		userService.update(2, updateUser);
//		
//		userService.getAll();
//		
		
	}
}	
		
	
		
