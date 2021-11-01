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

    // good

    
    public boolean createAccount(String userName, String firstName, String lastName, String email) { 
        return userList.addUser(userName, firstName, lastName, email); // will maybe need to add more to parameters
    }

    public boolean loginStudent(String userName) { // was not originally boolean
        if(!this.user.haveStudent(userName)) {
            return false;
        }
        this.user = userList.getUser(userName);
        return true;
    }

    public boolean loginEmployer(String userName) { // was not originally boolean
        if(!this.user.haveEmployer(userName)) {
            return false;
        }
        this.user = userList.getUser(userName);
        return true;
    }

    public ArrayList<Internships> getMyInternships() {
        return internshipList;
    }

    // add review internship
}
