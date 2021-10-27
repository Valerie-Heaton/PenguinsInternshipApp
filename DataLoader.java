import java.util.ArrayList;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

//will extend DataConstants

public class DataLoader extends DataConstants {

    //the class should be static

    public static ArrayList<Admin> loadAdmins() {

        //loading in admin.json
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            FileReader reader = new FileReader("admin.json");
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get("Admin.json");
                String lastName = (String) personJSON.get("Admin.json");
                String userName = (String) personJSON.get("Admin.json");
                String email = (String) personJSON.get("Admin.json");

                admins.add(new Admin(firstName, lastName, userName, email));
            }
            System.out.print(admins); //make sure it's working, comment out later
            return admins;

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
     return null;
    }

    public static ArrayList<Student> loadStudents() {

        // loading in student.json
        ArrayList<Student> students = new ArrayList<Student>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {

                //Strings
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                UUID id = UUID.fromString((String) personJSON.get(USER_ID));
                String userName = (String) personJSON.get(USER_USER_NAME);
                String firstName = (String) personJSON.get(USER_FIRST_NAME);
                String lastName = (String) personJSON.get(USER_LAST_NAME);
                String email = (String) personJSON.get(USER_EMAIL);
                String major = (String) personJSON.get(USER_MAJOR);

                //ArrayLists - get these to work?
                JSONObject courses = (JSONObject) peopleJSON.get(i);
                JSONObject experience = (JSONObject) peopleJSON.get(i);
                JSONObject education = (JSONObject) peopleJSON.get(i);
                JSONObject internshipsApplied = (JSONObject) peopleJSON.get(i);

                //work without throwing an error
                students.add(new Student(id, firstName, lastName, userName, email, major, courses, experience, education, internshipsApplied));
            }
            System.out.print(students); // make sure it's working
            return students;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 
     * /** Creates the array list that will fetch the list of ALL users and load it
     * as metadata
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
     * Creates the array list that will fetch the list of internship entries
     */
    public ArrayList<Internships> getInternships() {
        return null;
        
    }
    
}
