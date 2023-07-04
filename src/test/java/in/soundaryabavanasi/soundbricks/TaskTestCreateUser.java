package in.soundaryabavanasi.soundbricks;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class TaskTestCreateUser {

	
		// TODO Auto-generated method stub
		
		public void testCreateUserWithValidInput() {

			UserService userService = new UserService();

			Task newUser = new Task();
			newUser.setId(3);
			newUser.setName("Soundarya");
			newUser.setDueDate(LocalDate.of(2023, 7, 4));
			newUser.setActive(true);

			assertDoesNotThrow(() -> {
				userService.create(newUser);
			});

		}

	}


