package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.dao.TaskList;

public class TaskDAO {

	public Task[] findAll() {	
		Task[] userList = TaskList.listOfUser;
		return userList;
	}
	
	
	
	public void create(Task newuser) {
		

		
		Task[] userList = TaskList.listOfUser;
		for(int i=0; i<userList.length; i++) {
			
			Task user = userList[i];
			
			if(user==null) {
				userList[i] = newuser;

				break;
			}
			
		}
	}
public void update(int id, Task updateUser) {
		
		Task[] userList = TaskList.listOfUser;
		
		for(int i=0; i<userList.length; i++) {
			
			Task user = userList[i];
			
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
			
			Task[] userList = TaskList.listOfUser;
			
			for(int i=0; i<userList.length; i++) {
				
				Task user = userList[i];
				
				if(user==null) {
					continue;
				}
				
				if(user.getId()==id) {
					user.setActive(false);
					break;
				}
			}
		}
	
	public Task findById(int id) {
		Task[] userList = TaskList.listOfUser;
		Task userMatch = null;
	
		for (int i = 0; i < userList.length; i++) {
			Task user = userList[i];
			if (user.getId() == id) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}

}
