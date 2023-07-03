package in.soundaryabavanasi.soundbricks.userservice;
import in.soundaryabavanasi.soundbricks.*;
import in.soundaryabavanasi.soundbricks.dao.UserDAO;



   public class UserService {
	public User[] getAll() {
		public void create(User newUser) {
			UserDAO userDao = new UserDAO();
			userDao.create(newUser);
		}
		return userList;	
	}
   
	public void create(User newuser)throws Exception {
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newuser);
	}
	
	
	public void update() {
		User updatedUser = new User();
		UserDAO userDao = new UserDAO();
		userDao.update(11,updatedUser);
	}
	
	public void delete() {
		User deleteUser = new User();
		UserDAO userDao = new UserDAO();
		userDao.create(deleteUser);
	}
	

	

 }
