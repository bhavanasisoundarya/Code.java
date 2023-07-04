package in.soundaryabavanasi.soundbricks.userservice;

import in.soundaryabavanasi.soundbricks.dao.TaskDAO;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.validation.TaskValidator;


public class TaskService {
public Task[] getAll() {
		
		TaskDAO userDao = new TaskDAO();
		
		Task[] userList = userDao.findAll();
		
		for(int i=0; i<userList.length; i++) {
			
			System.out.println(userList[i]);
			
		}
				
		return userList;
	}
	
	public void create(Task newUser) throws Exception {
		
		TaskValidator.validate(newUser);
		
		TaskDAO userDao = new TaskDAO();
		userDao.create(newUser);		
		
	}
	
	
	public void update(int id, Task updateUser) {
				
		TaskDAO usersDao = new TaskDAO();
		usersDao.update(1,updateUser);
		
	}
	

	
	public Task findById(int id) {
		TaskDAO usersDao = new TaskDAO();
		Task user = usersDao.findById(id);
//		this.printUser(user);
		return user;
	}
}

