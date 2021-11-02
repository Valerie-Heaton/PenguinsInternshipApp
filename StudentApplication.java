import java.util.*;

public class StudentApplication {

    private InternshipList internshipList;
    private UserList userList;
    private User user;

    public StudentApplication() {
        this.internshipList = internshipList; // should it be get instance
        this.userList = userList;
        this.user = user;
    }

    public ArrayList<Internships> findInternships() {
        return internshipList.getInternships();
    }

    public ArrayList<Internships> findInternships(String keyword) {
        return internshipList.getInternships(keyword);
<<<<<<< HEAD
    }

    public boolean createAccount(String userName, String firstName, String lastName, String email) {
        return userList.addUser(userName, firstName, lastName, email); // will maybe need to add more to parameters
    }

    public boolean login(String userName, String password) { // was not originally boolean
        if (!userList.haveUser(userName)) {
=======
    }

    public boolean createStudentAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addStudent(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
    }

    // method

    public boolean login(String userName, String password) { // was not originally boolean
        if (!userList.haveAdmin(userName) || !userList.haveEmployer(userName) || !userList.haveStudent(userName)) {
>>>>>>> 31137904d2cc6e8751214ad311be7280a638bfb2
            return false;
        }
        user = userList.getUser(userName, password);
        return true;
    }

    public void logout() {
        userList.saveUsers();
    }

}
