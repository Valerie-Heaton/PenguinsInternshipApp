import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Valerie Heaton

class DataLoaderTest {

    private ArrayList<Student> studentList;

    @BeforeEach
    public void setup() {
        studentList.clear();
        
        studentList.add(new Student("Amy", "Walker", "awalker", "password", "awalker@gmail.com"));
        studentList.add(new Student("Nathan", "Drake", "ndradke", "password", "ndrake@gmail.com"));

        DataWriter.saveStudents();
    }

    @AfterEach
    public void tearDown() {
        studentList.clear();   
        DataWriter.saveStudents();
    }

    @Test
    void testGetStudentsSize() {
        studentList = DataLoader.getStudents();
        assertEquals(2, studentList.size());
    }

    @Test
    void testGetStudentsSizeZero() {
        studentList = DataLoader.getStudents();
        DataWriter.saveStudents();
        assertEquals(0, studentList.size());
    }

    @Test
    void testGetStudentsUserName() {
        studentList = DataLoader.getStudents();
        assertEquals("awalker", studentList.get(0).getUserName());
    }
}
