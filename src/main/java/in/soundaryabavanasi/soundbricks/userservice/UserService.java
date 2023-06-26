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

}
