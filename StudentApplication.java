import java.util.*;

public class StudentApplication {
    
    private InternshipList internshipList;
    private UserList userList;
    private User user;

    public StudentApplication() {
        this.internshipList = internshipList;
        this.userList = userList;
        this.user = user;
    }

    public ArrayList<Internships> findInternships() {
        return internshipList;
    }

    public ArrayList<Internships> findInternships(String keyword) {
        if(internshipList.contains(keyword))
        return internshipList;
    }

    public User createAccount(String firstName, String lastName, String userName) { 
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
        return user;
        return rating;
        return comment;
    }
}
