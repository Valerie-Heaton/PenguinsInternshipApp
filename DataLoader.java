import java.util.ArrayList;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

//will extend DataConstants

public class DataLoader {

    //the class should be static

    public static ArrayList<Admin> loadAdmins() {

        //loading in admin.json only for now
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
            System.out.print(admins); //make sure it's working
            return admins;

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
     return null;
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
     * Creates the array list that will fetch the list of internship entries
     */
    public ArrayList<Internships> getInternships() {
        return null;
        
    }
    
}
