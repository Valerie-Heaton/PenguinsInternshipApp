/**
* The DataLoader class that extends to the data constants program.
* 
* @author Siri, Maddie, Valerie, Ali
*/

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

/**
 * The DataLoader class that extends into the DataConstants class.
 */
public class DataLoader extends DataConstants {
    //the class should be static

    /**
     * Creates the array list that will fetch the list of ALL admins and load it as metadata
     */
    public static ArrayList<Admin> getAdmins() {
        /**
         * This array list loads in the admin.json object
         */
        ArrayList<Admin> admins = new ArrayList<Admin>();
        /**
        * The try statement catches exception in the new FileReader and JSONArray during execution 
        */
        try {
            FileReader reader = new FileReader("admin.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);
            /**
             * Creating an instance of the JSON object
             */
            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                UUID id = UUID.fromString((String) personJSON.get(USER_ID));
                String firstName = (String) personJSON.get(USER_FIRST_NAME);
                String lastName = (String) personJSON.get(USER_LAST_NAME);
                String userName = (String) personJSON.get(USER_USER_NAME);
                String email = (String) personJSON.get(USER_EMAIL);
                String password = (String) personJSON.get(USER_PASSWORD);

                admins.add(new Admin(id, firstName, lastName, userName, email, password));
            }
            System.out.print(admins); //make sure it's working, comment out later
            return admins;

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
     return null;
    }
    /**
     * Creates the array list that will fetch the list of ALL students and load it as metadata
     */
    public static ArrayList<Student> getStudents() {

        // loading in student.json
        ArrayList<Student> students = new ArrayList<Student>();
        /**
        * The try statement catches exception in the new FileReader and JSONArray during execution 
        */
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                /**
                 * These are the Strings that are established as a component of the 'personJSON' object
                 */
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                UUID id = UUID.fromString((String) personJSON.get(USER_ID));
                String userName = (String) personJSON.get(USER_USER_NAME);
                String firstName = (String) personJSON.get(USER_FIRST_NAME);
                String lastName = (String) personJSON.get(USER_LAST_NAME);
                String email = (String) personJSON.get(USER_EMAIL);
                String password = (String) personJSON.get(USER_PASSWORD);
                
                
                //work without throwing an error
                students.add(new Student(id, firstName, lastName, userName, email, password));
            }
            System.out.print(students); // make sure it's working
            return students;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Creates the array list that will fetch the list of ALL resumes and load it as metadata
     */
    public static ArrayList<Resume> getResumes() {

        ArrayList<Resume> resume = new ArrayList<Resume>();
        /**
        * The try statement catches exception in the new FileReader and JSONArray during execution 
        */
        try {
            FileReader reader = new FileReader("resume.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);
            /**
             * Creating an instance of the JSON object
             */
            for (int i = 0; i < peopleJSON.size(); i++) {
            //    resume.add(new Resume());
            }
            System.out.print(resume); // make sure it's working, comment out later
            return resume;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Creates the array list that will fetch the list of ALL internship entries and load it as metadata
     */
    public static ArrayList<Internships> getInternships() {

        ArrayList<Internships> internships = new ArrayList<Internships>();
        /**
        * The try statement catches exception in the new FileReader and JSONArray during execution 
        */
        try {
            FileReader reader = new FileReader("Internships.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                UUID id = UUID.fromString((String) personJSON.get(USER_ID));
                String title = (String) personJSON.get(USER_TITLE);
                String description = (String) personJSON.get(USER_DESCRIPTION);
                String location = (String) personJSON.get(USER_LOCATION);
                boolean inPerson = (boolean) personJSON.get(USER_IN_PERSON);
                boolean remote = (boolean) personJSON.get(USER_REMOTE);

                internships.add(new Internships(id, title, description, location, inPerson, remote));
            }
            System.out.print(internships); // make sure it's working, comment out later
            return internships;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Creates the array list that will fetch the list of ALL employers and load it as metadata
     */
    public static ArrayList<Employer> getEmployers() {

        ArrayList<Employer> employers = new ArrayList<Employer>();
        /**
        * The try statement catches exception in the new FileReader and JSONArray during execution 
        */
        try {
            FileReader reader = new FileReader("Employer.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);
            /**
             * Creating an instance of the JSON object
             */
            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                UUID id = UUID.fromString((String) personJSON.get(USER_ID));
                String firstName = (String) personJSON.get(USER_FIRST_NAME);
                String lastName = (String) personJSON.get(USER_LAST_NAME);
                String userName = (String) personJSON.get(USER_USER_NAME);
                String email = (String) personJSON.get(USER_EMAIL);
                String password = (String) personJSON.get(USER_PASSWORD);

                employers.add(new Employer(id, firstName, lastName, userName, email, password));
            }
            System.out.print(employers); // make sure it's working, comment out later
            return employers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}