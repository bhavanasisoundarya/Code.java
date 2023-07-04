package in.soundaryabavanasi.soundbricks.validation;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.UserTask;


public class TaskValidator {
	public static void validate(UserTask users) throws ValidateException {

		if (users == null) {
			throw new ValidateException("Invalid user input");
		}



	}

}
