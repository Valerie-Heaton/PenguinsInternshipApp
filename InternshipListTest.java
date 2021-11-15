/**
 * Written by Siri
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InternshipListTest {

    private InternshipList internships = InternshipList.getInstance();
    private ArrayList<Internships> internshipList = internships.getInternships();

    @BeforeEach
    public void setup() {
        internshipList.clear();
        internshipList.add(new Internships("Technical Writer", "Create technical documents such as manuals for systems.", "Columbia, SC", true, false));
        internshipList.add(new Internships("Data Analyst", "Gather, organize, and keep data for business use.", "Columbia, SC", true, true));
        DataWriter.saveInternships();
    }

    @AfterEach 
    public void tearDown() {
        InternshipList.getInstance().getInternships().clear();
        DataWriter.saveInternships();
    }

    @Test
    void testGetInternshipsJob() {
        ArrayList<Internships> getInternships = internships.getInternships("Technical Writer");
        assertEquals(internshipList.get(0), getInternships);
    }



}
