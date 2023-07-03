package in.soundaryabavanasi.soundbricks;

import in.soundaryabavanasi.soundbricks.dao.UserDAO;
import in.soundaryabavanasi.soundbricks.model.*;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class App {

//	private static final User UserupdateUser = null;

	public static void main(String[] args) {
		
		
	 UserService userservice = new UserService();
			User newUser = new User();
			newUser.setId(11);
			newUser.setEmail("sound@gmail.com");
			newUser.setFirstname("soundarya");
			newUser.setLastname("reddy");
			newUser.setActive(true);
			newUser.setPassword("sound@45");
				  
		
			UserDAO userDao = new UserDAO();
			userDao.create(newUser);
		
			
			 userservice.create(newUser);
			  userservice.getAll();
				
		}
	
//		UserService userService = new UserService();
//	
////		userService.create();
//		
//		userService.update();
	
		
		
	
		

	}

	



}
