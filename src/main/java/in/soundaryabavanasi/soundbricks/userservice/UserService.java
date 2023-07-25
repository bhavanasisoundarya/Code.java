package in.soundaryabavanasi.soundbricks.userservice;

import java.util.Set;

import in.soundaryabavanasi.soundbricks.dao.UserDAO;
import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.*;
import in.soundaryabavanasi.soundbricks.validation.UserValidator;

public class UserService {
	
	public void create(User newUser) throws ValidateException{
		
		UserValidator.validate(newUser);
		
		UserDAO userObj = new UserDAO();
		userObj.create(newUser);
		
		
	}
	
	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		return userList;
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public User findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	public void update() {
//		User newUser3 = new User();
//		newUser3.setId(12);
//		newUser3.setFirstname("Vaishnavi");
//		newUser3.setLastname("Shriram");
//		newUser3.setEmail("vaishnavi@gmail.com");
//		newUser3.setPassword("asdf***1234");
//		newUser3.setActive(true);
//		
//		UserDAO userObj = new UserDAO();
//		userObj.update(12, newUser3);
//	}
//	
//	
//	public void delete() {
//		User newUser4 = new User();
//		newUser4.setActive(false);
//		
//		UserDAO userObj = new UserDAO();
//		userObj.delete(12);
//	}
}