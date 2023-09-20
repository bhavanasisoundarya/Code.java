package in.soundaryabavanasi.soundbricks.userservice;

import java.util.Set;

import in.soundaryabavanasi.soundbricks.dao.UserDAO;
import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.*;
import in.soundaryabavanasi.soundbricks.validation.UserValidator;

public class UserService {
	
	
	
	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		return userList;
	}

public void create(User newUser) throws Exception {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);		
		
	}
	
	public void update(int id, User updateUser) {
				
//		UserValidator.validate(updateUser);
		
		UserDAO userDao = new UserDAO();
		userDao.update(id,updateUser);
		
	}

	public User findById(int id) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(id);
//		this.printUser(user);
		return user;
	}
	

}