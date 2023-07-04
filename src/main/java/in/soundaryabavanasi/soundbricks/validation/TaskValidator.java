package in.soundaryabavanasi.soundbricks.validation;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.Task;


public class TaskValidator {
	public static void validate(Task users) throws ValidateException {

		if (users == null) {
			throw new ValidateException("Invalid user input");
		}



	}

}
