import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    
    public static void saveStudent() {
		Student student = student.getInstance();
		ArrayList<Student> students = student.getPeople();
		JSONArray jsonStudents = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< students.size(); i++) {
			jsonFriends.add(getPersonJSON(students.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(jsonStudents.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getPersonJSON(Student student) {
		JSONObject studentDetails = new JSONObject();
		studentDetails.put(USER_FIRST_NAME, student.getFirstName());
		studentDetails.put(USER_LAST_NAME, student.getFirstName());
		studentDetails.put(USER_EMAIL, student.getEmail());
        
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
