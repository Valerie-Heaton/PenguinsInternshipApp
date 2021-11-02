/**
 * The Student Application class holds all of the data needed for the student to input
 * regarding a specific internship. The data will include the students login, password,
 * as well as finding internships, and rating them as well as providing comments.
 * This is the main interface.
 */

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
    }

    public boolean createAccount(String userName, String firstName, String lastName, String email) {
        return userList.addUser(userName, firstName, lastName, email); // will maybe need to add more to parameters
    }

    public boolean login(String userName, String password) { // was not originally boolean
        if (!userList.haveUser(userName)) {
            return false;
        }
        user = userList.getUser(userName, password);
        return true;
    }

    public void logout() {
        userList.saveUsers();
    }

}