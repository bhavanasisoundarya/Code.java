package in.soundaryabavanasi.soundbricks.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.util.StringUtil;


public class TaskValidator {
	public static void validate(Task task) throws ValidateException {
		if (task == null) {
			throw new ValidateException("Invalid task input");
		}
		StringUtil.rejectIfInvalidString(task.getTaskName(), "TaskName");
		StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
		
		////////  validate date   /////////
		
		String date = task.getDueDate();
		
		DateTimeFormatter formatpat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		LocalDate formatedDate = LocalDate.parse(date, formatpat);
		
		LocalDate.parse(date,
                DateTimeFormatter.ofPattern("dd.MM.uuuu").withResolverStyle(ResolverStyle.STRICT)
        );

}
}
