import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentApplicationTest {
    private StudentApplication studentApplication = new StudentApplication();
    private UserList userList = UserList.getInstance();
    private ArrayList<Student> studentList = userList.getStudents();
    private ArrayList<Employer> employerList = userList.getEmployers();
    private ArrayList<Admin> adminList = userList.getAdmins();


    @BeforeEach
    public void setup() {
        UserList.getInstance().getStudents().clear();
        UserList.getInstance().getEmployers().clear();
        UserList.getInstance().getAdmins().clear();
        DataWriter.saveStudents();
        DataWriter.saveEmployer();
        DataWriter.saveAdmin();
    }

    @AfterEach 
    public void tearDown() {
        UserList.getInstance().getStudents().clear();
        UserList.getInstance().getEmployers().clear();
        UserList.getInstance().getAdmins().clear();
        DataWriter.saveStudents();
        DataWriter.saveEmployer();
        DataWriter.saveAdmin();
    }

    @Test
    public void testFindInternships() {
        ArrayList<Internships> findInternships1 = studentApplication.findInternships();
        ArrayList<Internships> findInternships2 = new ArrayList<Internships>();
        assertEquals(findInternships1, findInternships2);       
    }

    public void testCreateValidAdminAccount() {
        studentApplication.createAdminAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.loginAdmin("amywalker", "amyw1234");
        Admin admin = studentApplication.getCurrentAdmin();
        assertEquals("amywalker", admin.getUserName());
    }

    public void testCreateSavedAdmin() {
        studentApplication.createAdminAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.logout();
        studentApplication = new StudentApplication();
        studentApplication.loginAdmin("amywalker", "amyw1234");
        Admin currentAdmin = studentApplication.getCurrentAdmin();
        assertEquals("amywalker", currentAdmin.getUserName());
    }

    @Test
    public void testCreatDuplicateAdminUserName() {
        studentApplication.createAdminAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        boolean isCreated = studentApplication.createAdminAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        assertFalse(isCreated);
    }

    @Test
    public void testCreateAdminEmptyUserName() {
        boolean isCreated = studentApplication.createAdminAccount("", "", "", "", "");
        assertFalse(isCreated);
    }

    @Test 
    public void testCreateAdminNullUserName() {
        boolean isCreated = studentApplication.createAdminAccount(null, "", "", "", "");
        assertFalse(isCreated);
    }

}