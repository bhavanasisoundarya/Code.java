package in.soundaryabavanasi.soundbricks;

import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class App {

	public static void main(String[] args) {
		UserService userserve = new UserService();
		userserve.create();
		userserve.getAll();
		

	}

}
