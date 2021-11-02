import java.net.PasswordAuthentication;
import java.util.Scanner;
public class InternshipUI {


private final String WELCOME_MESSAGE = "Welcome to the inernship app";
private String[] mainMenuOptions = {"Login,", "Prints out resume to a text file", "filter", "Login with a job listing"};
private Scanner scanner;


private Internships internship;
private Resume resume;
private StudentApplication studentApplication;
private Student student;
private String userName;
private String password;
private DataWriter dataWriter;
private Scanner sc = new Scanner(System.in);


  
  public InternshipUI() {
      internship = new Internships(null, WELCOME_MESSAGE, WELCOME_MESSAGE, WELCOME_MESSAGE, false, false);
      resume = new Resume();
      this.studentApplication = new StudentApplication();
      student = new Student(WELCOME_MESSAGE, WELCOME_MESSAGE, WELCOME_MESSAGE, WELCOME_MESSAGE, WELCOME_MESSAGE);
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




switch(userCommand) {
case(0):
System.out.println("Enter username:");
sc.nextLine();
System.out.println("Enter password:");
sc.nextLine();




this.studentApplication.login(userName, password);
student.insertResume();
internship.getSkillsRequired();
resume.getEducation();//not a method yet
resume.getExperience();
break;
case(1):
System.out.println("Printing your resume to a .txt file");
DataWriter.toTextFile();
//printsOutResume();
//TODO find prints out resume method - CALL FROM RESUME
break;
case(2):
internship.getSkillsRequired();
studentApplication.findInternships();


//how do i find jobs that require java knowledge
//TODO go back to internship class and find the internships
//TODO we have to make a method for picking and selecting a job
break;
case(3):
studentApplication.login(userName, password);
studentApplication.findInternships();
Student.getInstance();


//studentApplication.reviewInternships();
//student.getStudentUsers();


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


String input = sc.nextLine();
int command = Integer.parseInt(input) - 1;


if (command >= 0 && command <= numCommands - 1)
return command;


return -1;
}


}
