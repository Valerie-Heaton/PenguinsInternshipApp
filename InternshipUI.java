import java.util.Scanner;
public class InternshipUI {
    private static final String WELCOME_MESSAGE = "Welcome to the inernship app";
    private String[] mainMenuOptions = {"Login,", "Prints out resume to a text file", "filter", "Login with a job listing"};
    private Scanner scanner; 
    private Internships internship;
    
    InternshipUI() {
        scanner = new Scanner(System.in);
        internship = new Internships(null, null, null);
    }
    public void run() {
<<<<<<< HEAD
        System.out.println(WELCOME_MESSAGE);
    //
    /**while(true) {
        displayMainMenu();
        int userCommand = getUserCommand(mainMenuOptions.length);
        if(userCommand == -1) {
            System.out.println("not a valid command");
        }
    }*/
    //private void displayMainMenu() {
		//System.out.println("\n************ Main Menu *************");
		//for(int i=0; i< mainMenuOptions.length; i++) {
		//	System.out.println((i+1) + ". " + mainMenuOptions[i]);
		//}
		//System.out.println("\n");
	//}
=======
		System.out.println(WELCOME_MESSAGE);
		
		//Loop as long as we want to keep interacting with the library
		while(true) {
			displayMainMenu();
			int userCommand = getUserCommand(mainMenuOptions.length);
			
			if(userCommand == -1) {
				System.out.println("Not a valid command");
				continue;
			}
			
			//if they picked the last option then log them out
			if(userCommand == mainMenuOptions.length -1) break;
		
			switch(userCommand) {
				case(0):
                    login();//TODO find login method in class 
                    //TODO put in instructions in scenario 2 in dropbox
					break;
				case(1):
					printsOutResume();//TODO find prints out resume method
					break;
				case(2):
					Filter();//find filter method
					break;
				case(3):
					LoginWithanExistingJob();//TODO find method with existing jjob
					break;
			}
		}
		
		System.out.println("Good bye, and have a nice day");
		
	}
        
    private void displayMainMenu() {
		System.out.println("\n************ Main Menu *************");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
		}
		System.out.println("\n");
    }
}
>>>>>>> bffa61e (making changes to git)
	
    


