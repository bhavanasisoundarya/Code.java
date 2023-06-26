package in.soundaryabavanasi.soundbricks.userservice;

import in.soundaryabavanasi.soundbricks.dao.UserDAO;
import in.soundaryabavanasi.soundbricks.model.User;

public class UserService {
	public User[] getAll(){
		UserDAO user = new UserDAO();
		User[] userList = user.findAll();
		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		 }
		return userList;
	}
	public void create() {
		User
		user1 = new User();
		user1.setId(75);
		user1.setFirstname("soundarya");
		user1.setLastname("Bavanasi");
		user1.setActive(true);
	    user1.setPassword("sound");
	    
		UserDAO userDao = new UserDAO();
		userDao.create(user1);
	}
 }
