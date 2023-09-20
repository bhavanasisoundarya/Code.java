package in.soundaryabavanasi.soundbricks;

import in.soundaryabavanasi.soundbricks.userservice.TaskService;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.model.Task;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

import java.time.LocalDate;

    public class App {
//     public static void main(String[] args) {
//        User newUser = new User();
//        newUser.setUserId(3);
//        newUser.setFirstName("soundarya");
//        newUser.setLastName("Bavanasi");
//        newUser.setEmailId("soundarya@gmail.com");
//        newUser.setPassword("sound@12");
//        newUser.setActive(true);
//
//        UserService userService = new UserService();
//
//        try {
//            User newUser1 = new User();
//            newUser1.setUserId(2);
//            newUser1.setFirstName("soundarya");
//            newUser1.setLastName("Bavanasi");
//            newUser1.setEmailId("sound@gmail.com");
//            newUser1.setPassword("sound@12");
//            newUser1.setActive(true);
//
//            userService.create(newUser);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        User updateUser = new User();
//        updateUser.setUserId(2);
//        updateUser.setFirstName("Reddy");
//        updateUser.setLastName("soundarya");
//        updateUser.setEmailId("reddy@gmail.com");
//        updateUser.setPassword("reddy@12");
//        updateUser.setActive(true);
//
//        //userService.update();
//
//        userService.getAll();
//        
//        
//
//        //////////////////FOR TASK////////////
//
//        try {
//            TaskService taskService = new TaskService();
//            Task newTask = new Task();
//            newTask.setId(1);
//            newTask.setName("Chinna");
//            newTask.setDueDate(LocalDate.of(2023, 7, 4));
//            newTask.setActive(true);
//            taskService.create(newTask);
//            taskService.getAll();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    
//    
//   
//	try {
//		 TaskService newservice = new TaskService();
//		Task newTask = new Task();
//		newTask.setId(12345);
//		newTask.setName("Write");
//		String date = "09-07-2023";
//		LocalDate convert = newservice.convertToDate(date);
//		newTask.setDueDate(convert);
//		newTask.setActive(true);
//		
//		newservice.create(newTask);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
    	public static void main(String[] args) {
    		
    		    int n = 4;
    		    for (int i = 1; i <= n; i++) {
    		        for (int j = 1; j <= n - i; j++) {
    		            System.out.print(" ");
    		        }
    		        for (int k = 1; k <= i; k++) {
    		            System.out.print("1 ");
    		        }
    		        System.out.println();
    		    }
    		}

            
//            int rows = 5; 
//            
//            for (int i = 1; i <= rows; i++) {
//                for (int j = 1; j <= i; j++) {
//                    if (j % 2 == 0) {
//                        System.out.print("# ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//
//               
//                System.out.println();
//            }
//            
            
            
            
        }

