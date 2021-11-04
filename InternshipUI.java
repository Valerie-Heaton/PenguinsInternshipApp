import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class InternshipUI {

	private static final String WELCOME_MESSAGE = "Welcome to our Internship App!";
	private String[] mainMenuOptions = {"Scenario 1: Login to Account & Add Resume", "Scenario 2: Print Resume", "Scenario 3: Find Jobs with Specific Skill", "Scenario 4: View Job Listing and Applicants as Employee"};

	private Scanner scanner;
	private StudentApplication studentApplication;

	public InternshipUI() {
		scanner = new Scanner(System.in);
		studentApplication = new StudentApplication();
	}

	public void run() {

		System.out.println(WELCOME_MESSAGE);
		

		while(true) {

			displayMainMenu();

			int userCommand = getUserCommand(mainMenuOptions.length);

			if(userCommand == -1) {
				System.out.println("Not a valid command");
				continue;
			}

			if(userCommand == mainMenuOptions.length - 1) {
				studentApplication.logout(); 
				break;
			}

			switch(userCommand) {
				case(0): 
					login();
					addResume();
				case(1):
					break;
				case(2):
					break;
				case(3):
					break;
			}
		}

	}

	private void displayMainMenu() {
		System.out.println("\n************ Main Menu *************");
		for(int i=0; i < mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
			System.out.println("\n");
		}
		System.out.println("\n");
	}

	private int getUserCommand(int numCommands) {
		System.out.print("What would you like to do?:");

		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;

		if(command >= 0 && command <= numCommands - 1) return command;
		return -1;
	}

	private void login() {
		
		System.out.println("Are you a student, employer, or admin? Type in student, employer, or admin"); 
		String userInput = scanner.nextLine();

		if(userInput.equalsIgnoreCase("student")) {
			System.out.println("Enter username:");
   			String userName = scanner.nextLine();
   			System.out.println("Enter password:");
			String password = scanner.nextLine();
			this.studentApplication.loginStudent(userName, password);
		 	//System.out.println("Logged in..");
			//addResume();
	 	}
		else if(userInput.equalsIgnoreCase("admin")) {
			System.out.println("Enter username:");
   			String userName = scanner.nextLine();
   			System.out.println("Enter password:");
			String password = scanner.nextLine();
			this.studentApplication.loginAdmin(userName, password);
			//System.out.println("Logged in..");
	 	}
	 	else if(userInput.equalsIgnoreCase("employer")) {
			System.out.println("Enter username:");
   			String userName = scanner.nextLine();
   			System.out.println("Enter password:");
			String password = scanner.nextLine();
			this.studentApplication.loginEmployer(userName, password);
			//System.out.println("Logged in..");
	 	}
		 
	}

	private String getField(String prompt) {
		System.out.print(prompt + ": ");
		return scanner.nextLine();
	}

	private int getIntField(String prompt) {
		System.out.print(prompt + ": ");
		return scanner.nextInt();
	} 

	private void addResume() {
		String skills = getField("Skills");
		
		String schoolEducationReceived = getField("School Education Received");
		String major = getField("Major");
		int yearGraduated = getIntField("Year of Graduation");
		Education education = new Education(schoolEducationReceived, major, yearGraduated);

		int numberOfExperiences = getIntField("Number of Experiences You Would Like to Add");
		ArrayList<Experience> experience = new ArrayList<Experience>();
		for(int i = 0; i < numberOfExperiences; i++) {
			System.out.println("Position:");
			String position = scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("Company:");
			String company = scanner.nextLine();

			System.out.println("Type Internship if it is a Internship, otherwise type the type of job:");
			String internship = scanner.nextLine();

			System.out.println("Date:");
			String date = scanner.nextLine();

			System.out.println("Description for What You Created During Your Internship");
			String createdDescription = scanner.nextLine();

			System.out.println("Description for Position During Your Internship");
			String positionDescription = scanner.nextLine();

			Experience addExperience = new Experience(position, company, internship, date, createdDescription, positionDescription);
			experience.add(addExperience);
		}

		Resume resume = new Resume(skills, education, experience);
		this.studentApplication.addStudentResume(resume);
	}

	// for scenario 3, just search the arraylist of their skills required from internships class

}