package in.soundaryabavanasi.soundbricks.dao;

import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.dao.TaskList;

public class TaskDAO {

	public Task[] findAll() {	
		Task[] taskList = TaskList.listOfUser;
		return taskList;
	}
	
	
	
	public void create(Task newuser) {
		
    Task[] taskList = TaskList.listOfUser;
		for(int i=0; i<taskList.length; i++) {
			
			Task task = taskList[i];
			
			if(task==null) {
				taskList[i] = newuser;

				break;
			}
			
		}
	}
	
	/**
	 *
	 * @param id
	 * @param updateUser
	 */
	
	public void update(int id, Task updateUser) {
		
		Task[] taskList = TaskList.listOfUser;
		
		for(int i=0; i<taskList.length; i++) {
			
			Task task = taskList[i];
			
			if(task==null) {
				continue;
			}
			
			if(task.getId()==id) {

				
				task.setName(updateUser.getName());
				task.setDueDate(updateUser.getDueDate());
				
				
				break;
			}
			
		}
		
	}

			
		
		
	
	
	public void delete(int id) {
			
			Task[] taskList = TaskList.listOfUser;
			
			for(int i=0; i<taskList.length; i++) {
				
				Task task = taskList[i];
				
				if(task==null) {
					continue;
				}
				
				if(task.getId()==id) {
					task.setActive(false);
					break;
				}
			}
		}
	
	public Task findById(int id) {
		Task[] taskList = TaskList.listOfUser;
		Task taskMatch = null;
	
		for (int i = 0; i < taskList.length; i++) {
			Task user = taskList[i];
			if (user.getId() == id) {
				taskMatch = user;
				break;
			}
		}
		return taskMatch;
	}



	

}
