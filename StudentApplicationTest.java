/**
 * Written by Siri
 */

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
    void testFindInternships() {
        ArrayList<Internships> findInternships1 = studentApplication.findInternships();
        ArrayList<Internships> findInternships2 = new ArrayList<Internships>();
        assertEquals(findInternships1, findInternships2);       
    }

    // admin 

    @Test
    void testCreateValidAdminAccount() {
        studentApplication.createAdminAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.loginAdmin("amywalker", "amyw1234");
        Admin admin = studentApplication.getCurrentAdmin();
        assertEquals("amywalker", admin.getUserName());
    }

    @Test
    void testCreateSavedAdmin() {
        studentApplication.createAdminAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.logout();
        studentApplication = new StudentApplication();
        studentApplication.loginAdmin("amywalker", "amyw1234");
        Admin currentAdmin = studentApplication.getCurrentAdmin();
        assertEquals("amywalker", currentAdmin.getUserName());
    }

    @Test
    void testCreatDuplicateAdminUserName() {
        studentApplication.createAdminAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        boolean isCreated = studentApplication.createAdminAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        assertFalse(isCreated);
    }

    @Test
    void testCreateAdminEmptyUserName() {
        boolean isCreated = studentApplication.createAdminAccount("", "", "", "", "");
        assertFalse(isCreated);
    }

    @Test 
    void testCreateAdminNullUserName() {
        boolean isCreated = studentApplication.createAdminAccount(null, "", "", "", "");
        assertFalse(isCreated);
    }

    // student

    @Test
    void testCreateValidStudentAccount() {
        studentApplication.createStudentAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.loginStudent("amywalker", "amyw1234");
        Student student = studentApplication.getCurrentStudent();
        assertEquals("amywalker", student.getUserName());
    }

    @Test
    void testCreateSavedStudent() {
        studentApplication.createStudentAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.logout();
        studentApplication = new StudentApplication();
        studentApplication.loginStudent("amywalker", "amyw1234");
        Student currentStudent = studentApplication.getCurrentStudent();
        assertEquals("amywalker", currentStudent.getUserName());
    }

    @Test
    void testCreatDuplicateStudentUserName() {
        studentApplication.createStudentAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        boolean isCreated = studentApplication.createStudentAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        assertFalse(isCreated);
    }

    @Test
    void testCreateStudentEmptyUserName() {
        boolean isCreated = studentApplication.createStudentAccount("", "", "", "", "");
        assertFalse(isCreated);
    }

    @Test 
    void testCreateStudentNullUserName() {
        boolean isCreated = studentApplication.createStudentAccount(null, "", "", "", "");
        assertFalse(isCreated);
    }

    // employer

    @Test
    void testCreateValidEmployerAccount() {
        studentApplication.createEmployerAccount("amywalker", "Amy", "Walker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.loginEmployer("amywalker", "amyw1234");
        Employer employer = studentApplication.getCurrentEmployer();
        assertEquals("amywalker", employer.getUserName());
    }

    @Test
    void testCreateSavedEmployer() {
        studentApplication.createEmployerAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        studentApplication.logout();
        studentApplication = new StudentApplication();
        studentApplication.loginEmployer("amywalker", "amyw1234");
        Employer currentEmployer = studentApplication.getCurrentEmployer();
        assertEquals("amywalker", currentEmployer.getUserName());
    }

    @Test
    void testCreatDuplicateEmployerUserName() {
        studentApplication.createEmployerAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        boolean isCreated = studentApplication.createEmployerAccount("Amy", "Walker", "amywalker", "amyw1234", "amywalker@email.sc.edu");
        assertFalse(isCreated);
    }

    @Test
    void testCreateEmployerEmptyUserName() {
        boolean isCreated = studentApplication.createEmployerAccount("", "", "", "", "");
        assertFalse(isCreated);
    }

    @Test 
    void testCreateEmployerNullUserName() {
        boolean isCreated = studentApplication.createEmployerAccount(null, "", "", "", "");
        assertFalse(isCreated);
    }

    
}