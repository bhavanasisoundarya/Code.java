package in.soundaryabavanasi.soundbricks.userservice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import in.soundaryabavanasi.soundbricks.dao.TaskDAO;
import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.validation.TaskValidator;


public class TaskService {
	public Set<Task> getAll() {
		TaskDAO taskDao = new TaskDAO();
		Set<Task> taskList = taskDao.findAll();
		return taskList;
	}
	public void create(Task newTask) throws Exception {
//		TaskValidator.validate(newTask);
		try {
			TaskValidator.validate(newTask);
		} catch (ValidateException e) {
			throw new ValidateException(e.getMessage());
		
		} catch (Exception e) {
			throw new ValidateException("Invalid date or invalid date format(dd.mm.yyyy)");
		}
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}
	
	/**
	 *
	 * @param id
	 * @param updateTask
	 */
	public void update(int id, Task updateTask) {
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(1, updateTask);
	}
//
//	public void delete() {
//
//		TaskEntity deleteTask = new TaskEntity();
//
//		TaskDAO taskDao = new TaskDAO();
//		taskDao.delete(1);
//
//	}
//
	public Task findById(int id) {
		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(id);
		return task;
	}




}


