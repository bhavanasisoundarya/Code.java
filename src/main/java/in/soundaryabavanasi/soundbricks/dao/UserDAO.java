package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.User;

public class UserDAO {
	
	public User[]findAll(){
		User[] user = UserList.listOfUser;
		return user;
		
	}
	
	public void create() {
		User user = new User();
		user.setId(75);
		user.setEmail("soundarya@gmail.com");
		user.setFirstname("soundarya");
		user.setLastname("Bavanasi");
		user.setActive(true);
	    user.setPassword("sound");
	    
	    UserList.listOfUser[0] = user;
	    
		
	}

}
