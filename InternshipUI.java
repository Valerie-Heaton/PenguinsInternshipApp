import java.util.Scanner;
public class InternshipUI {
    private static final String WELCOME_MESSAGE = "Welcome to the inernship app";
    private String[] mainMenuOptions = {"Login,", "Prints out resume to a text file", "filter", "Login with a job listing"};
    private Scanner scanner; 
   private Internships internship;
    
    InternshipUI() {
        scanner = new Scanner(System.in);
        internship = new Internships(null, null, null, false, false);
    }
    public void run() {
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
	
    


