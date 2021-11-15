import java.util.ArrayList;

/**
 * Written by Siri
 */
public class DataWriterTest {
    
    private UserList userList = UserList.getInstance();
    private ArrayList<Student> studentList = userList.getStudents();
    private ArrayList<Employer> employerList = userList.getEmployers();
    private ArrayList<Admin> adminList = userList.getAdmins();
    private InternshipList internships = InternshipList.getInstance();
    private ArrayList<Internships> internshipList = internships.getInternships();


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

    //Admin
	
	@Test
	void testWritingZeroAdmins() {
		adminList = DataLoader.getAdmins();
		assertEquals(0, adminList.size());
	}

	@Test
	void testWritingOneAdmin() {
		adminList.add(new Admin("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		DataWriter.saveAdmin();
		assertEquals("amywalker", DataLoader.getAdmins().get(0).getUserName());
	}
	
	@Test
	void testWritingFiveAdmins() {
		adminList.add(new Admin("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		adminList.add(new Admin("Sam", "West", "samwest", "ilovecomputerscience098", "swest@gmail.com"));
        adminList.add(new Admin("Olivia", "John", "oliviajohn", "olive", "oliviaj@gmail.com"));
        adminList.add(new Admin("Jackson", "Brown", "jbrown", "jack0517", "jbrown@gmail.com"));
        adminList.add(new Admin("Jessica", "Smith", "jessicasm", "iloveapples", "jessicasm@email.sc.edu"));
		DataWriter.saveAdmin();
		assertEquals("jessicasm", DataLoader.getAdmins().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyAdmin() {
		adminList.add(new Admin("", "", "", "", ""));
		DataWriter.saveAdmin();
		assertEquals("", DataLoader.getAdmins().get(0).getUserName());
	}
	
	@Test
	void testWritingNullAdmin() {
		adminList.add(new Admin(null, "", "", "", ""));
		DataWriter.saveAdmin();
		assertEquals(null, DataLoader.getAdmins().get(0).getUserName());
	}

    //Student
    @Test
	void testWritingZeroStudents() {
		studentList = DataLoader.getStudents();
		assertEquals(0, studentList.size());
	}

	@Test
	void testWritingOneStudent() {
		studentList.add(new Student("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		DataWriter.saveStudents();
		assertEquals("amywalker", DataLoader.getStudents().get(0).getUserName());
	}

	@Test
	void testWritingFiveStudents() {
		studentList.add(new Student("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		studentList.add(new Student("Sam", "West", "samwest", "ilovecomputerscience098", "swest@gmail.com"));
        studentList.add(new Student("Olivia", "John", "oliviajohn", "olive", "oliviaj@gmail.com"));
        studentList.add(new Student("Jackson", "Brown", "jbrown", "jack0517", "jbrown@gmail.com"));
        studentList.add(new Student("Jessica", "Smith", "jessicasm", "iloveapples", "jessicasm@email.sc.edu"));
		DataWriter.saveStudents();
		assertEquals("jessicasm", DataLoader.getStudents().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyAdmin() {
		studentList.add(new Student("", "", "", "", ""));
		DataWriter.saveStudents();
		assertEquals("", DataLoader.getStudents().get(0).getUserName());
	}
	
	@Test
	void testWritingNullStudent() {
		studentList.add(new Student(null, "", "", "", ""));
		DataWriter.saveStudents();
		assertEquals(null, DataLoader.getStudents().get(0).getUserName());
	}

    //Employer

    @Test
	void testWritingZeroEmployers() {
		employerList = DataLoader.getEmployers();
		assertEquals(0, employerList.size());
	}

	@Test
	void testWritingOneEmployer() {
		employerList.add(new Employer("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		DataWriter.saveEmployer();
		assertEquals("amywalker", DataLoader.getEmployers().get(0).getUserName());
	}

	@Test
	void testWritingFiveEmployers() {
		employerList.add(new Employer("Amy", "Walker", "amywalker", "amyw1234", "amywalker@gmail.com"));
		employerList.add(new Employer("Sam", "West", "samwest", "ilovecomputerscience098", "swest@gmail.com"));
        employerList.add(new Employer("Olivia", "John", "oliviajohn", "olive", "oliviaj@gmail.com"));
        employerList.add(new Employer("Jackson", "Brown", "jbrown", "jack0517", "jbrown@gmail.com"));
        employerList.add(new Employer("Jessica", "Smith", "jessicasm", "iloveapples", "jessicasm@email.sc.edu"));
		DataWriter.saveEmployer();
		assertEquals("jessicasm", DataLoader.getEmployers().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyEmployer() {
		employerList.add(new Employer("", "", "", "", ""));
		DataWriter.saveEmployer();
		assertEquals("", DataLoader.getEmployers().get(0).getUserName());
	}
	
	@Test
	void testWritingNullEmployer() {
		employerList.add(new Employer(null, "", "", "", ""));
		DataWriter.saveEmployer();
		assertEquals(null, DataLoader.getEmployers().get(0).getUserName());
	}

    // Internships
    
    @Test
	void testWritingZeroInternships() {
		internshipList = DataLoader.getInternships();
		assertEquals(0, internshipList.size());
	}

	@Test
	void testWritingOneInternship() {
		internshipList.add(new Internships("Technical Writer", "Create technical documents such as manuals for systems.", "Columbia, SC", true, false));
		DataWriter.saveInternships();
		assertEquals("Technical Writer", DataLoader.getInternships().get(0).getTitle());
	}

	@Test
	void testWritingFiveInternships() {
		internshipList.add(new Internships("Technical Writer", "Create technical documents such as manuals for systems.", "Columbia, SC", true, false));
        internshipList.add(new Internships("Data Analyst", "Gather, organize, and keep data for business use.", "Columbia, SC", true, true));
		internshipList.add(new Internships("Software Engineer", "Write programs.", "Columbia, SC", true, false));
        internshipList.add(new Internships("Systems Analyst", "Gather, organize, and keep data.", "Columbia, SC", true, true));
		internshipList.add(new Internships("Software Developer", "Write software for company's programs.", "Columbia, SC", true, false));
		DataWriter.saveEmployer();
		assertEquals("Software Developer", DataLoader.getInternships().get(4).getTitle());
	}
	
	@Test
	void testWritingEmptyInternship() {
		internshipList.add(new Internships("", "", "", false, false));
		DataWriter.saveInternships();
		assertEquals("", DataLoader.getInternships().get(0).getTitle());
	}
	
	@Test
	void testWritingNullInternship() {
		internshipList.add(new Internships(null, "", "", false, false));
		DataWriter.saveInternships();
		assertEquals(null, DataLoader.getInternships().get(0).getTitle());
	}


}
