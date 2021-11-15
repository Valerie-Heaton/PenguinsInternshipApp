import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserListTest {
    
    private UserList users = UserList.getInstance();
    private ArrayList<Student> studentList = users.getStudents();
    private ArrayList<Employer> employerList = users.getEmployers();
    private ArrayList<Admin> adminList = users.getAdmins();

    @BeforeEach
    public void setup() {
        adminList.clear();
        studentList.clear();
        employerList.clear();
        adminList.add(new Admin("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
        adminList.add(new Admin("Sam", "West", "samwest", "ilovecomputerscience098", "swest@gmail.com"));
        employerList.add(new Employer("Olivia", "John", "oliviajohn", "olive", "oliviaj@gmail.com"));
        employerList.add(new Employer("Jackson", "Brown", "jbrown", "jack0517", "jbrown@gmail.com"));
        studentList.add(new Student("Jessica", "Smith", "jessicasm", "iloveapples", "jessicasm@email.sc.edu"));
        studentList.add(new Student("Nathan", "Drake", "nathandrake", "nathand1234", "nathandrake@email.sc.edu"));
        DataWriter.saveAdmin();
        DataWriter.saveEmployer();
        DataWriter.saveStudents();
    }

    @AfterEach 
    public void tearDown() {
        UserList.getInstance().getAdmins().clear();
        UserList.getInstance().getEmployers().clear();
        UserList.getInstance().getStudents().clear();
        DataWriter.saveAdmin();
        DataWriter.saveEmployer();
        DataWriter.saveStudents();
    }

    @Test
	void testHaveAdminValidFirstItem() {
		boolean hasAmy = users.haveAdmin("amywalker");
		assertTrue(hasAmy);
	}
	
	@Test
	void testHaveAdminValidLastItem() {
		boolean hasSam = users.haveAdmin("samwest");
		assertTrue(hasSam);
	}
	
	@Test
	void testHaveAdminInValid() {
		boolean hasJoe = users.haveAdmin("jsmith");
		assertFalse(hasJoe);
	}
	
	@Test
	void testHaveAdminEmpty() {
		boolean hasEmpty = users.haveAdmin("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveAdminNull() {
		boolean hasNull = users.haveAdmin(null);
		assertFalse(hasNull);
	}

    @Test
	void testHaveStudentValidFirstItem() {
		boolean hasAmy = users.haveStudent("jessicasm");
		assertTrue(hasAmy);
	}
	
	@Test
	void testHaveStudentValidLastItem() {
		boolean hasSam = users.haveStudent("nathandrake");
		assertTrue(hasSam);
	}
	
	@Test
	void testHaveStudentInValid() {
		boolean hasJoe = users.haveStudent("jsmith");
		assertFalse(hasJoe);
	}
	
	@Test
	void testHaveStudentEmpty() {
		boolean hasEmpty = users.haveStudent("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveStudentNull() {
		boolean hasNull = users.haveStudent(null);
		assertFalse(hasNull);
	}

    @Test
	void testHaveEmployerValidFirstItem() {
		boolean hasAmy = users.haveEmployer("oliviajohn");
		assertTrue(hasAmy);
	}
	
	@Test
	void testHaveEmployerValidLastItem() {
		boolean hasSam = users.haveEmployer("jbrown");
		assertTrue(hasSam);
	}
	
	@Test
	void testHaveEmployerInValid() {
		boolean hasJoe = users.haveEmployer("jsmith");
		assertFalse(hasJoe);
	}
	
	@Test
	void testHaveEmployerEmpty() {
		boolean hasEmpty = users.haveEmployer("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveEmployerNull() {
		boolean hasNull = users.haveEmployer(null);
		assertFalse(hasNull);
	}
    
    @Test
    void testGetAdmin() {
        Admin getAdmin = users.getAdmin("amywalker", "amyw1234");
        assertEquals("amywalker", getAdmin.getUserName());
    }


    @Test
    void testGetStudent() {
        Student getStudent = users.getStudent("jessicasm", "iloveapples");
        assertEquals("jessicasm", getStudent.getUserName());
    }

    @Test
    void testGetEmployer() {
        Employer getEmployer = users.getEmployer("jbrown", "jack0517");
        assertEquals("jbrown", getEmployer.getUserName());
    }

    @Test
    void testAddAdmin() {
       boolean hasAmy = users.addAdmin("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com");
       assertTrue(hasAmy);
    }

    @Test
    void testAddStudent() {
       boolean hasJessica = users.addAdmin("Jessica", "Smith", "jessicasm", "iloveapples", "jessicasm@email.sc.edu");
       assertTrue(hasJessica);
    }

    @Test
    void testAddEmployer() {
       boolean hasOlivia = users.addAdmin("Olivia", "John", "oliviajohn", "olive", "oliviaj@gmail.com");
       assertTrue(hasOlivia);
    }

    

}

