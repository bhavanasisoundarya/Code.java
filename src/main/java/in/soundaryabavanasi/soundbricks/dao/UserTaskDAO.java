package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.UserTask;
import in.soundaryabavanasi.soundbricks.dao.UserTaskList;

public class UserTaskDAO {

	public UserTask[] findAll() {	
		UserTask[] userList = UserTaskList.listOfUser;
		return userList;
	}
	
	
	
	public void create(UserTask newuser) {
		

		
		UserTask[] userList = UserTaskList.listOfUser;
		for(int i=0; i<userList.length; i++) {
			
			UserTask user = userList[i];
			
			if(user==null) {
				userList[i] = newuser;

				break;
			}
			
		}
	}
public void update(int id, UserTask updateUser) {
		
		UserTask[] userList = UserTaskList.listOfUser;
		
		for(int i=0; i<userList.length; i++) {
			
			UserTask user = userList[i];
			
			if(user==null) {
				continue;
			}
			
			if(user.getId()==id) {

				
				user.setName(updateUser.getName());
				
				
				break;
			}
			
		}
		
	}
	
	public void delete(int id) {
			
			UserTask[] userList = UserTaskList.listOfUser;
			
			for(int i=0; i<userList.length; i++) {
				
				UserTask user = userList[i];
				
				if(user==null) {
					continue;
				}
				
				if(user.getId()==id) {
					user.setActive(false);
					break;
				}
			}
		}
	
	public UserTask findById(int id) {
		UserTask[] userList = UserTaskList.listOfUser;
		UserTask userMatch = null;
	
		for (int i = 0; i < userList.length; i++) {
			UserTask user = userList[i];
			if (user.getId() == id) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}

}
