import java.util.*;

public class StudentApplication {

    private InternshipList internshipList;
    private UserList userList;
    private User user;

    public StudentApplication() {
        this.internshipList = internshipList.getInstance();
        this.userList = userList.getInstance();
    }

    public ArrayList<Internships> findInternships() {
        return internshipList.getInternships();
    }

    public ArrayList<Internships> findInternships(String keyword) {
        return internshipList.getInternships(keyword);
    }

    public boolean createAdminAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addAdmin(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
    }

    public boolean loginStudent(String userName, String password) { // was not originally boolean
        if (!userList.haveStudent(userName)) {
            return false;
        }
    

    public boolean login(String userName, String password) { // was not originally boolean
        if (!userList.haveAdmin(userName) || !userList.haveEmployer(userName) || !userList.haveStudent(userName)) {
            return false;
        }

        user = userList.getAdmin(userName, password);
        return true;
    }

    public void logout() {
        userList.saveUsers();
    }

}
