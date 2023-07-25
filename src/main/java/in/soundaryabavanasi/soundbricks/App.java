package in.soundaryabavanasi.soundbricks;

import in.soundaryabavanasi.soundbricks.userservice.TaskService;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

import java.time.LocalDate;

    public class App {
     public static void main(String[] args) {
        User newUser = new User();
        newUser.setId(3);
        newUser.setFirstname("soundarya");
        newUser.setLastname("Bavanasi");
        newUser.setEmail("soundarya@gmail.com");
        newUser.setPassword("sound@12");
        newUser.setActive(true);

        UserService userService = new UserService();

        try {
            User newUser1 = new User();
            newUser1.setId(2);
            newUser1.setFirstname("soundarya");
            newUser1.setLastname("Bavanasi");
            newUser1.setEmail("sound@gmail.com");
            newUser1.setPassword("sound@12");
            newUser1.setActive(true);

            userService.create(newUser);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User updateUser = new User();
        updateUser.setId(2);
        updateUser.setFirstname("Reddy");
        updateUser.setLastname("soundarya");
        updateUser.setEmail("reddy@gmail.com");
        updateUser.setPassword("reddy@12");
        updateUser.setActive(true);

        userService.update();

        userService.getAll();
        
        

        //////////////////FOR TASK////////////

        try {
            TaskService taskService = new TaskService();
            Task newTask = new Task();
            newTask.setId(1);
            newTask.setName("Chinna");
            newTask.setDueDate(LocalDate.of(2023, 7, 4));
            newTask.setActive(true);
            taskService.create(newTask);
            taskService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
   
	try {
		 TaskService newservice = new TaskService();
		Task newTask = new Task();
		newTask.setId(12345);
		newTask.setName("Write");
		String date = "09-07-2023";
		LocalDate convert = newservice.convertToDate(date);
		newTask.setDueDate(convert);
		newTask.setActive(true);
		
		newservice.create(newTask);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
