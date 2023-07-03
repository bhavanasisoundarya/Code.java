package in.soundaryabavanasi.soundbricks.validation;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.util.StringUtil;
import in.soundaryabavanasi.soundbricks.exception.ValidateException;
public class UserValidator {
	
	public static void validate(User user) throws ValidateException {
		
		if(user==null) {
			throw new  ValidateException("Invalid user input");
		}
		
//		
//		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
//			
//			throw new Exception("Email cannot be null or empty");
//			
//		}
		
		StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
//		
	}
	
	public static void passwordValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
//		
//		if(user.getPassword()==null || "".equals(user.getPassword().trim())) {
//			
//			throw new Exception("Password cannot be null or empty");
//			
//		}
		
		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
		
	}
	
	public static void firstNameValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
//		if(user.getFirstname()==null || "".equals(user.getFirstname().trim())) {
//			
//			throw new Exception("Firstname cannot be null or empty");
//			
//		}
		
		StringUtil.rejectIfInvalidString(user.getFirstname(), "FirstName");

		
	}
}