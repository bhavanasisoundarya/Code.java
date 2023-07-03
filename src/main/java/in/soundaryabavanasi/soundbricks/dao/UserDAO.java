package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.User;

public class UserDAO {
	public User[] findAll() {
		User[] userlist = UserList.listOfUser;
		return userlist;
	}
	
	public void create(User newUser) {
//		UserList.listOfUser[0] = newUser;
		User[] arr = UserList.listOfUser;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				arr[i] = newUser;
				break;
			}
		}
	}

	/**
	 * 
	 *
	 * @param id
	 * @param updateUser
	 */
	public void update(int id, User updateUser) {
		User[] arr = UserList.listOfUser;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				updateUser.setFirstname("Sandhya");
				user.setFirstname(updateUser.getFirstname());
				user.setFirstname(updateUser.getFirstname());
				user.setPassword(updateUser.getPassword());
				break;
			}
		}
	}
}









