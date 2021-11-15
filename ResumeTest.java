/**
 * Resume class tested by Ali Tehranie + Maddie Havranak
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * This references the testing code guide at smartbear.com & stackoverflow.com
 */
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResumeTest {
  private Resume resume = new Resume();

  private ArrayList<Resume> resumes = resumes.getInstance();
  private ArrayList<String> courses = resumes.getCourses();
  private ArrayList<Experience> experience = resumes.getExperience();
  private ArrayList<String> skills = resumes.getSkills();
  private ArrayList<Education> education = resumes.getEducation();
  	
	@BeforeEach
	public static void oneTimeSetup() {
    resumes.getInstance().getCourses().clear();
		resumes.getInstance().getExperience().clear();
    resumes.getInstance().getSkills().clear();
    resumes.getInstance().getEducation().clear();

    DataWriter.saveCourses();
    DataWriter.saveExperience();
    DataWriter.saveSkills();
    DataWriter.saveEducation();

	}
	
	@AfterEach
	public static void oneTimeTearDown() {
    resumes.getInstance().getCourses().clear();
		resumes.getInstance().getExperience().clear();
    resumes.getInstance().getSkills().clear();
    resumes.getInstance().getEducation().clear();

    DataWriter.saveCourses();
    DataWriter.saveExperience();
    DataWriter.saveSkills();
    DataWriter.saveEducation();
		
	}

  @Test
	public void testGetCourses() {
    ArrayList<String> getCourses1 = resume.getCourses();
    ArrayList<String> getCourses2 = new ArrayList<Courses>();
    assertEquals(getCourses1, getCourses2);  
	}

  @Test
	public void testGetExperience() {
    ArrayList<String> getExperience1 = resume.getExperience();
    ArrayList<String> getExperience2 = new ArrayList<Experience>();
    assertEquals(getExperience1, getExperience2);  
	}

  @Test
	public void testGetSkills() {
    ArrayList<String> getSkills1 = resume.getSkills();
    ArrayList<String> getSkills2 = new ArrayList<Skills>();
    assertEquals(getSkills1, getSkills2);  
	}

  @Test
	public void testGetEducation() {
    ArrayList<String> getEducation1 = resume.getEducation();
    ArrayList<String> getEducation2 = new ArrayList<Education>();
    assertEquals(getEducation1, getEducation2);  
	}

  @Test
	public void testGetResumes() {
    ArrayList<String> getResumes1 = resume.getResumes();
    ArrayList<String> getResumes2 = new ArrayList<Resumes>();
    assertEquals(getResumes1, getResumes2);  
	}
	
}