package in.soundaryabavanasi.soundbricks.dao;
import in.soundaryabavanasi.soundbricks.model.User;
public class UserDAO {
	public User[] findAll() {	
		User[] userList = UserList.listOfUser;
		return userList;
	}
	
	
	
	public void create(User newuser) {
		
//		UserList.listOfUsers[0] = newuser;
		
		User[] userList = UserList.listOfUser;
		for(int i=0; i<userList.length; i++) {
			
			User user = userList[i];
			
			if(user==null) {
				userList[i] = newuser;
//				user = newuser;
				break;
			}
			
		}
	}
	
	/**
	 *
	 * @param id
	 * @param updateUser
	 */
	
	public void update(int id, User updateUser) {
		
		User[] userList = UserList.listOfUser;
		
		for(int i=0; i<userList.length; i++) {
			
			User user = userList[i];
			
			if(user==null) {
				continue;
			}
			
			if(user.getId()==id) {

				
				user.setFirstname(updateUser.getFirstname());
				user.setLastname(updateUser.getLastname());
				user.setPassword(updateUser.getPassword());
				
				break;
			}
			
		}
		
	}
	
	public void delete(int id) {
			
			User[] userList = UserList.listOfUser;
			
			for(int i=0; i<userList.length; i++) {
				
				User user = userList[i];
				
				if(user==null) {
					continue;
				}
				
				if(user.getId()==id) {
					user.setActive(false);
					break;
				}
			}
		}
	public User findById(int id) {
		User[] userList = UserList.listOfUser;
		User userMatch = null;
	
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == id) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}
	
}