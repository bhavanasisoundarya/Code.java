package in.soundaryabavanasi.soundbricks;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.userservice.TaskService;

public class TaskTestCreateUser {

	// TODO Auto-generated method stub
	@Test
	public void testCreateUserWithValidInput() {

		TaskService userService = new TaskService();

		Task newUser = new Task();
		newUser.setId(3);
		newUser.setName("Sandhya");
		String date = "06-07-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newUser.setDueDate(convert);
		newUser.setActive(true);

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});

	}

	@Test
	public void testCreateTaskWithInValidInput() {
		TaskService taskservice = new TaskService();
		Exception exception = assertThrows(ValidateException.class, () -> {
			taskservice.create(null);
		});
		String expectedMessage = "Invalid Task input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	

	@Test

	public void testCreateUserWithNameNull() {
		TaskService taskservice = new TaskService();
		Task newTask = new Task();
		newTask.setId(12345);
		newTask.setName(null);
		String date = "06-07-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);
		newTask.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "name cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test

	public void testCreateUserWithNameEmpty() {
		TaskService taskservice = new TaskService();
		Task newTask = new Task();
		newTask.setId(12345);
		newTask.setName("");
		String date = "06-07-2023";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);
		newTask.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "name cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test

	public void testCreateUserWithInvalidDueDate() {
		TaskService taskservice = new TaskService();
		Task newTask = new Task();
		newTask.setId(12345);
		newTask.setName("Write");
		String date = "06-08-2022";
		LocalDate convert = TaskService.convertToDate(date);
		newTask.setDueDate(convert);
		newTask.setActive(true);

		Exception exception = assertThrows(ValidateException.class, () -> {
			taskservice.create(newTask);
		});
		String expectedMessage = "due date Invalid";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

}
