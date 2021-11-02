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
        this.internshipList = internshipList; // should it be get instance
        this.userList = userList;
        this.user = user;
    }

    public ArrayList<Internships> findInternships() {
        return internshipList.getInternships();
    }

    public ArrayList<Internships> findInternships(String keyword) {
        this.keyword = keyword;
        if(internshipList.contains(keyword))
        return internshipList;
    }
    
    public boolean createAccount(String userName, String firstName, String lastName, String email) { 
        return userList.addUser(userName, firstName, lastName, email); // will maybe need to add more to parameters
    }

<<<<<<< HEAD
    public User createAccount(String firstName, String lastName, String userName) { 
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        return user;// will maybe need to add more to parameters
=======
    // public boolean createEmployerAccount(String userName, String firstName, String lastName, String email) { 
    //     return userList.addEmployerUser(userName, firstName, lastName, email); // will maybe need to add more to parameters
    // }
>>>>>>> c899116b0d027c33a4632475532a682fe9d6a098

    public boolean loginUser(String userName) { // was not originally boolean
        if(!userList.haveUser(userName)) {
            return false;
        }
        user = userList.getUser(userName);
        return true;
    }


    // public ArrayList<Internships> getMyInternships() {
    //     return internshipList;
    // }

<<<<<<< HEAD
    public reviewInternship(User rater, int rating, String comment) {
        this.firstName = rater;
        this.lastName = rating;
        this.userName = comment;
=======
    public void logout() {
        userList.saveUsers();
>>>>>>> c899116b0d027c33a4632475532a682fe9d6a098
    }

    // add review internship
}