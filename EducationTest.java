import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//Valerie Heaton

class EducationTest {

    private Education education;

    private ArrayList<Education> educationList;
    private ArrayList<Education> educationWrong;

    @BeforeEach
    public void setup() {
        educationList.clear();
        educationWrong.clear();
        
        DataWriter.saveResume();
    }

    @AfterEach
    public void tearDown() {
        educationList.clear();
        educationWrong.clear();

        DataWriter.saveResume();

    }

    @Test
    void testEducation() {
        educationList.add(new Education("awalker", "Computer Science", 2023));
        boolean hasAmy = education.checkSchoolEducationReceived();
        assertTrue(hasAmy);
    }

    @Test
    void testYear() {
        boolean hasAmy = educationList.add(new Education("awalker", "Computer Science", 2023));
        hasAmy = education.checkYearGraduated();
        assertTrue(hasAmy);
    }

    @Test
    void testMajor() {
        boolean hasAmy = educationList.add(new Education("awalker", "Computer Science", 2023));
        hasAmy = education.checkMajor();
        assertTrue(hasAmy);
    }

    @Test
    void testMajorNull() {
        boolean hasNoMajor = educationWrong.add(new Education("ndrake", null, 1999));
        hasNoMajor = education.checkMajor();
        assertFalse(hasNoMajor);
    }

    void testInvalidGrad() {
        boolean badYear = educationWrong.add(new Education("ndrake", null, 1999));
        badYear = education.checkYearGraduated();
        assertFalse(badYear);

    }

}