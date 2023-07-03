package in.soundaryabavanasi.soundbricks.validation;
import java.lang.Exception;

public class UserValidator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  public static void validate(User user) throws Exception{
	  
	  
	  if(user==null) {
		  throw new Exception("Invalide user input");
	  }
	  
	  if("".equals(user.getEmail().trim()));
	  throw new Exception("Email can not be null or Empty");
  }
  
  if("".equals(user.getPassword().trim()));
  
  throw new Exception("Password can not be null");
		
	}
	
	

}
