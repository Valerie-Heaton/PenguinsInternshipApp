import java.util.Scanner;
public class InternshipUI {
    private final String WELCOME_MESSAGE = "Welcome to the inernship app";
    private String[] mainMenuOptions = {"Login,", "Prints out resume to a text file", "filter", "Login with a job listing"};
    private Scanner scanner; 
   private static Internships internship;
   private static Resume resume;
   private static StudentApplication studentApplication;
   private Student student;

    
    InternshipUI() {
        scanner = new Scanner(System.in);
	}
    public void run() {
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
					login(userName, password);
					student.insertResume();
					internship.getSkillsRequired();
					resume.getEducation();//not a method yet
					resume.getExperience();
					break;
				case(1):
					printsOutResume();//TODO find prints out resume method
					break;
				case(2):
					internship.getSkillsRequired();
					studentApplication.findInternships(keyword);
					//how do i find jobs that require java knowledge
					//TODO go back to internship class and find the internships 
					//TODO we have to make a method for picking and selecting a job
					break;
				case(3):
					login(userName, password);//login as an employer
					studentApplication.reviewInternships(rater, rating, comment);
					student.getStudentUsers();
					//TODO find method with existing job
					//TODO once we make the method for selecting and applying to a job we allow the listing to be views
					break;
			}
		}
	}
        
    private void displayMainMenu() {
		System.out.println("\n************ Main Menu *************");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
		}
		System.out.println("\n");
	}



private int getUserCommand(int numCommands) {
	System.out.print("What would you like to do?: ");
	
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
	
		}
	}


