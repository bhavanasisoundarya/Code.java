package in.soundaryabavanasi.soundbricks.interfaceFiles;

import in.soundaryabavanasi.soundbricks.model.User;

public interface UserInterface extends Base<User> {
	
	public abstract User findByEmail(String  email);
	public abstract int count();
	
}
