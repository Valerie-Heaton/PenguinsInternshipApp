import java.net.PasswordAuthentication;
import java.util.Scanner;
import java.util.UUID;

public class InternshipUI {


private final String WELCOME_MESSAGE = "Welcome to the inernship app";
private String[] mainMenuOptions = {"Login,", "Prints out resume to a text file", "filter", "Login with a job listing"};


private Internships internship;
private UUID id;
private String title;
private String description;
private String location;
private boolean inPerson;
private boolean remote;
private String keyword;

private Resume resume;
private StudentApplication studentApplication;

private Student student;
private String firstName;
private String lastName;
private String email;

private String userName;
private String password;
private DataWriter dataWriter;
private Scanner sc = new Scanner(System.in);


  
  public InternshipUI() {
      internship = new Internships(id, title, description, location, inPerson, remote);
      resume = new Resume();
      this.studentApplication = new StudentApplication();
      student = new Student(firstName, lastName, userName, password, email);
      dataWriter = new DataWriter();
}
  
public void run() {
       System.out.println(WELCOME_MESSAGE);


//Loop as long as we want to keep interacting with the internships


while(true) {


displayMainMenu();
int userCommand = getUserCommand(mainMenuOptions.length);


if(userCommand == -1) {
System.out.println("Not a valid command");
continue;
}
//if they picked the last option then log them out
if(userCommand == mainMenuOptions.length -1) break;

/**
 *  Using switch statements for scenarios
 * */ 


	switch(userCommand) {

	/**
	 * Code for scenario 1
	 */
		case(0):

	/**
	 * Prompt user to login as student, employer, or admin, chosen using Scanner
	 * input
	 */

		System.out.println("Are you a student, employer, or admin? Type in student, employer, or admin"); 
		String userInput = sc.nextLine();

			if(userInput.equalsIgnoreCase("student")) {
   				System.out.println("Enter username:");
   				sc.nextLine();
   				System.out.println("Enter password:");
   				sc.nextLine();
   				this.studentApplication.loginStudent(userName, password);
   				student.insertResume();
   				internship.getSkillsRequired();
   				resume.getEducation();//not a method yet
   				resume.getExperience();
			}
			else if(userInput.equalsIgnoreCase("admin")) {
   				System.out.println("Enter username:");
   				sc.nextLine();
   				System.out.println("Enter password:");
   				sc.nextLine();
   				this.studentApplication.loginAdmin(userName, password);
			}
			else if(userInput.equalsIgnoreCase("employer")) {
   				System.out.println("Enter username:");
   				sc.nextLine();
   				System.out.println("Enter password:");
   				sc.nextLine();
   				this.studentApplication.loginEmployer(userName, password);
			}
		break;

/**
 * Code for scenario 2
 */

case(1):
	System.out.println("Printing your resume to a .txt file");
	DataWriter.toTextFile();
	break;


/**
 * Code for scenario 3
 */
case(2):
	internship.getSkillsRequired();
	internship.contains(keyword);
	studentApplication.findInternships();
	break;

/**
 * Code for scenario 4
 */
case(3):

/**
 * Prompt user to login as student, employer, or admin, chosen using Scanner input, again
 */
		System.out.println("Are you a student, employer, or admin? Type in student, employer, or admin"); 
		String userLog = sc.nextLine();

		/**
		 * Utilize if statements in order to show scenario data
		 */

	if(userLog.equalsIgnoreCase("student")) {
   		System.out.println("Enter username:");
   		sc.nextLine();
   		System.out.println("Enter password:");
   		sc.nextLine();
   		this.studentApplication.loginStudent(userName, password);
   		student.insertResume();
   		internship.getSkillsRequired();
   		resume.getEducation();//not a method yet
   		resume.getExperience();
	}
	else if(userLog.equalsIgnoreCase("admin")) {
   		System.out.println("Enter username:");
   		sc.nextLine();
   		System.out.println("Enter password:");
   		sc.nextLine();
   		this.studentApplication.loginAdmin(userName, password);
	}
	else if(userLog.equalsIgnoreCase("employer")) {
   		System.out.println("Enter username:");
   		sc.nextLine();
   		System.out.println("Enter password:");
   		sc.nextLine();
   		this.studentApplication.loginEmployer(userName, password);
		
		studentApplication.findInternships();
		Student.getInstance();
		}
		break;
		}
	}
}

/**
 * End of switch statements for scenarios.
 * Method to display the menu.
 */
      
   private void displayMainMenu() {
		System.out.println("\n************ Main Menu *************");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
}
			System.out.println("\n");
		}


	private int getUserCommand(int numCommands) {
		System.out.print("What would you like to do?: ");


		String input = sc.nextLine();
		int command = Integer.parseInt(input) - 1;


		if (command >= 0 && command <= numCommands - 1)
			return command;
		return -1;
	}
}
