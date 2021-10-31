import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    
    public static void saveStudent() {
		Student student = student.getInstance();
		ArrayList<Student> students = student.getStudentUsers();
		JSONArray jsonStudents = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< students.size(); i++) {
			jsonStudents.add(getStudentJSON(students.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(jsonStudents.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getStudentJSON(Student student) {
		JSONObject studentDetails = new JSONObject();
		studentDetails.put(USER_FIRST_NAME, student.getFirstName());
		studentDetails.put(USER_LAST_NAME, student.getFirstName());
		studentDetails.put(USER_EMAIL, student.getEmail());
        ArrayList<String> courses = student.getCourses();
        JSONArray jsonCourses = new JSONArray();
        for (int i = 0; i < courses.size(); i++) {
            jsonCourses.add(courses.get(i));
        }
        studentDetails.put(USER_COURSES, jsonCourses);
        
        ArrayList<Experience> experiences = student.getExperiences();
        JSONArray jsonExperiences = new JSONArray();
        for (int i = 0; i < experiences.size(); i++) {
            JSONObject jsonExperience = new JSONObject();
            jsonExperience.put();
            jsonExperiences.add(jsonExperience);
        }
        studentDetails.put(USER_EXPERIENCE, jsonExperiences);
        return studentDetails;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Creates the array list that will fetch the list of ALL users and load it as metadata
     */
    public ArrayList<User> getUsers() {
        return null;

    }
    /**
     * Creates the array list that will fetch the list of STUDENT users and load it as metadata
     */
    public ArrayList<Student> getStudentUsers() {
        return null;

    }
    /**
     * Creates the array list that will fetch the list of EMPLOYER users and load it as metadata
     */
    public ArrayList<Employer> getEmployerUsers() {
        return null;

    }
    /**
     * Creates the array list that will fetch the list of ALL internship entries
     */
    public ArrayList<Internships> getInternships() {
        return null;
        
    }
    
}
