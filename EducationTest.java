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
        boolean hasAmy = educationList.add(new Education("UofSC", "Computer Science", 2023));
        hasAmy = education.checkSchoolEducationReceived();
        assertTrue(hasAmy);
    }

    @Test
    void testYear() {
        boolean hasAmy = educationList.add(new Education("UofSC", "Computer Science", 2023));
        hasAmy = education.checkYearGraduated();
        assertTrue(hasAmy);
    }

    @Test
    void testMajor() {
        boolean hasAmy = educationList.add(new Education("UofSC", "Computer Science", 2023));
        hasAmy = education.checkMajor();
        assertTrue(hasAmy);
    }

    @Test
    void testMajorNull() {
        boolean hasNoMajor = educationWrong.add(new Education("UofSC", null, 1999));
        hasNoMajor = education.checkMajor();
        assertFalse(hasNoMajor);
    }
    
    @Test
    void testInvalidGrad() {
        boolean badYear = educationWrong.add(new Education("UofSC", "Computer Information Systems", 1999));
        badYear = education.checkYearGraduated();
        assertFalse(badYear);

    }

    @Test
    void testNoSchool() {
        boolean noSchool = educationWrong.add(new Education(null, "Computer Information Systems", 2023));
        noSchool = education.checkYearGraduated();
        assertFalse(noSchool);
    }

    @Test
    void testSchoolVariation() {
        boolean varSchool = educationList.add(new Education("U.S.C", "Computer Science", 2023));
        varSchool = education.checkYearGraduated();
        assertFalse(varSchool);
    }

}