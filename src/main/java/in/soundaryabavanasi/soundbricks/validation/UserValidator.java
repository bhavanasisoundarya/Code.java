package in.soundaryabavanasi.soundbricks.validation;

import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.util.StringUtil;
import in.soundaryabavanasi.soundbricks.exception.ValidateException;

public class UserValidator {

	public static void validate(User user) throws ValidateException {

		if (user == null) {
			throw new ValidateException("Invalid user input");
		}

//		
//		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
//			
//			throw new Exception("Email cannot be null or empty");
//			
//		}

		StringUtil.rejectIfInvalidString(user.getEmailId(), "Email");

		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");

		StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");

	}
}