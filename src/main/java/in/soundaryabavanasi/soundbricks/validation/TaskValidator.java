package in.soundaryabavanasi.soundbricks.validation;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.util.StringUtil;


public class TaskValidator {
	public static void validate(Task task) throws Exception {

		if (task == null) {
			throw new ValidateException("Invalid Task input");
		}
		StringUtil.rejectIfInvalidString(task.getName(), "name");

		StringUtil.rejectIfInvalidDate(task.getDueDate(), "due date");



	}

}
