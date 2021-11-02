/**
 * The Student Application class holds all of the data needed for the student to input
 * regarding a specific internship. The data will include the students login, password,
 * as well as finding internships, and rating them as well as providing comments.
 * This is the main interface.
 */

import java.util.*;

public class StudentApplication {
    /**
     * Private variables for the StudentApplication class
     */    
    private InternshipList internshipList;
    private UserList userList;
    private User user;
    /**
     * Create instances
     */
    public StudentApplication() {
        this.internshipList = internshipList;
        this.userList = userList;
        this.user = user;
    }

    public ArrayList<Internships> findInternships() {
        return internshipList;
    }

    public ArrayList<Internships> findInternships(String keyword) {
        this.keyword = keyword;
        if(internshipList.contains(keyword))
        return internshipList;
    }

    public User createAccount(String firstName, String lastName, String userName) { 
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        return user;// will maybe need to add more to parameters

    }

    public User login(String userName, String password) {
        if(userName.equals(this.user) && password.equals(this.user))
        return user;
    }

    public ArrayList<Internships> getMyInternships() {
        return internshipList;
    }

    public reviewInternship(User rater, int rating, String comment) {
        this.firstName = rater;
        this.lastName = rating;
        this.userName = comment;
        return user;
        return rating;
        return comment;
    }
}
