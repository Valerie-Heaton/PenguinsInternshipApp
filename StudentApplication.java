import java.util.*;

public class StudentApplication {
    /**
     * The private variables for the StudentApplication class.
     */
    private InternshipList internshipList;
    private UserList userList;
    private User user;

    /**
     * This is the constructor for the StudentApplication class.
     */
    public StudentApplication() {
        this.internshipList = internshipList.getInstance();
        this.userList = userList.getInstance();
    }

    /**
    * This Array List method fetches and finds internships for the user.
    * @return returns internship entries.
    */    
    public ArrayList<Internships> findInternships() {
        return internshipList.getInternships();
    }

    /**
    * This Array List method fetches and finds internships for the user with a specific keyword.
    * @return returns internship entries including a specific keyword.
    */     
    public ArrayList<Internships> findInternships(String keyword) {
        return internshipList.getInternships(keyword);
    }

    /**
     * This boolean registers once an admin has created an account.
     * @param userName is a String that registers the admin's user name.
     * @param firstName is a String that registers the admin's first name.
     * @param lastName is a String that registers the admin's last name.
     * @param password is a String that registers the admin's password.
     * @param email is a String that registers the admin's email.
     * @return returns a use list that adds the admin and their parameters to the system.
     */ 
    public boolean createAdminAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addAdmin(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
    }

    /**
     * This boolean logs in a student user account.
     * @param userName is a String that registers the student's user name.
     * @param password is a String that registers the student's password.
     * @return runs through to check if the inputted username is equal to the student's registered
     * username, returning false if such is not true, denying access to the system.
     */     
    public boolean loginStudent(String userName, String password) { // was not originally boolean
        if (!userList.haveStudent(userName)) {
            return false;
        }

        user = userList.getStudent(userName, password);
        return true;
    }

    public void addStudentResume(Resume resume) {
        ((Student)user).setResume(resume);
    }

    /**
     * This boolean logs in an employer user account.
     * @param userName is a String that registers the employer's user name.
     * @param password is a String that registers the employer's password.
     * @return runs through to check if the inputted username is equal to the employer's registered
     * username, returning false if such is not true, denying access to the system.
     */         
    public boolean loginEmployer(String userName, String password) { // was not originally boolean
        if (!userList.haveEmployer(userName)) {
            return false;
        }

        user = userList.getEmployer(userName, password);
        return true;
    }

    /**
     * This boolean logs in an admin user account.
     * @param userName is a String that registers the admin's user name.
     * @param password is a String that registers the admin's password.
     * @return runs through to check if the inputted username is equal to the admin's registered
     * username, returning false if such is not true, denying access to the system.
     */        
    public boolean loginAdmin(String userName, String password) { // was not originally boolean
        if (!userList.haveAdmin(userName)) {
            return false;
        }

        user = userList.getAdmin(userName, password);
        return true;
    }

    // CREATE RESUME METHOD
    // public boolean createResume(ArrayList<String> skills, ArrayList<Experience> experience, ArrayList<education>) {
    //     return addResume(skills, education, experience); // will maybe need to add more to parameters
    // }

    public void logout() {
        userList.saveUsers();
    }

}
