package in.soundaryabavanasi.soundbricks.validation;
import in.soundaryabavanasi.soundbricks.model.User;
public class UserValidator {
	
	public static void validate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
			
			throw new Exception("Email cannot be null or empty");
			
		}
		
	}
	
	public static void passwordValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getPassword()==null || "".equals(user.getPassword().trim())) {
			
			throw new Exception("Password cannot be null or empty");
			
		}
		
	}
	
	public static void firstNameValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getFirstname()==null || "".equals(user.getFirstname().trim())) {
			
			throw new Exception("Firstname cannot be null or empty");
			
		}
		
	}
}