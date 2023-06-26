package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.User;

public class UserDAO {
	
	public User[] findAll(){
		User[] userList = UserList.listOfUser;
		return userList;
		
	}
	
	public void create(User user1) {
		UserList.listOfUser[5] = user1;
		
	}

}
