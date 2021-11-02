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
<<<<<<< HEAD
=======
    }


    public boolean createStudentAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addStudent(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
    }

    public boolean createEmployerAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addAdmin(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
>>>>>>> 0313da9815b1e29830d9c0ae88381a9144ca39d7
    }

    public boolean createAdminAccount(String userName, String firstName, String lastName, String password, String email) {
        return userList.addAdmin(userName, firstName, lastName, password, email); // will maybe need to add more to parameters
    }

    public boolean loginStudent(String userName, String password) { // was not originally boolean
        if (!userList.haveStudent(userName)) {
            return false;
        }

<<<<<<< HEAD
    public boolean login(String userName, String password) { // was not originally boolean
        if (!userList.haveAdmin(userName) || !userList.haveEmployer(userName) || !userList.haveStudent(userName)) {
=======
        user = userList.getStudent(userName, password);
        return true;
    }

    public boolean loginEmployer(String userName, String password) { // was not originally boolean
        if (!userList.haveEmployer(userName)) {
            return false;
        }

        user = userList.getEmployer(userName, password);
        return true;
    }

    public boolean loginAdmin(String userName, String password) { // was not originally boolean
        if (!userList.haveAdmin(userName)) {
>>>>>>> 0313da9815b1e29830d9c0ae88381a9144ca39d7
            return false;
        }

        user = userList.getAdmin(userName, password);
        return true;
    }

    public void logout() {
        userList.saveUsers();
    }

}
