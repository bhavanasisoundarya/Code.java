package in.soundaryabavanasi.soundbricks;
import java.util.Set;
import org.junit.jupiter.api.Test;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.userservice.TaskService;

public class TestgetAllTasks {
	@Test

	public void getAllTasks() {
		TaskService taskService = new TaskService();
		Set<Task> taskList = taskService.getAll();
		System.out.println(taskList);
	}
	
	
@Test

	public void getById() {
		TaskService taskService = new TaskService();
		Task taskList = taskService.findById(1);
		System.out.println(taskList);
	}
	
	
@Test

	public void testUpdateUser() {
		TaskService taskService = new TaskService();
		
		Task updateTask = new Task();
		
		updateTask.setTaskName("Tech test");
		updateTask.setDueDate("20.09.2023");
		
		taskService.update(1, updateTask);
		
		
	}








}
