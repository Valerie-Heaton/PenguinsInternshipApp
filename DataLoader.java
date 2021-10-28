import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

//will extend DataConstants

public class DataLoader extends DataConstants {

    //the class should be static

    public static ArrayList<Admin> getAdmins() {

        //loading in admin.json
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            FileReader reader = new FileReader("admin.json");
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

    public static ArrayList<Student> getStudents() {

        // loading in student.json
        ArrayList<Student> students = new ArrayList<Student>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
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
                
                
                //work without throwing an error
                students.add(new Student(id, firstName, lastName, userName, email, major));
            }
            System.out.print(students); // make sure it's working
            return students;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Resume> getResumes() {

        ArrayList<Resume> resume = new ArrayList<Resume>();

        try {
            FileReader reader = new FileReader("resume.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String major = (String) personJSON.get("resume.json");
                String experience = (String) personJSON.get("resume.json");
                //arrays need work

                resume.add(new Resume(major, experience));
            }
            System.out.print(resume); // make sure it's working, comment out later
            return resume;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Internships> getInternships() {

        ArrayList<Internships> internships = new ArrayList<Internships>();

        try {
            FileReader reader = new FileReader("Internships.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String title = (String) personJSON.get("user.json");
                String description = (String) personJSON.get("user.json");
                String location = (String) personJSON.get("user.json");
                boolean online = (boolean) personJSON.get("user.json");
                boolean remote = (boolean) personJSON.get("user.json");

                internships.add(new Internships(title, description, location, online, remote));
            }
            System.out.print(internships); // make sure it's working, comment out later
            return internships;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Employer> getEmployers() {

        ArrayList<Employer> employers = new ArrayList<Employer>();

        try {
            FileReader reader = new FileReader("Employer.json");
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get("Employer.json");
                String lastName = (String) personJSON.get("Employer.json");
                String userName = (String) personJSON.get("Employer.json");
                String email = (String) personJSON.get("Employer.json");

                employers.add(new Employer(firstName, lastName, userName, email));
            }
            System.out.print(employers); // make sure it's working, comment out later
            return employers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}