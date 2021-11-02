
/**
* The DataWriter class that extends to the data constants program.
*
* @author Siri, Maddie, Valerie, Ali
*/

import java.util.ArrayList;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * The DataWriter class that extends into the DataConstants class.
 */
public class DataWriter extends DataConstants {
    public static void saveStudents() {
        //UserList userList = new UserList();
        UserList student = UserList.getInstance();
        ArrayList<Student> students = student.getStudents();
        JSONArray jsonStudents = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < students.size(); i++) {
            jsonStudents.add(getStudentJSON(students.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(jsonStudents.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This public static method gets our resume JSON and is used in the save resume
     * method.
     * 
     * @param student is the appropriate student and assigned to studentDetails.
     */
    public static JSONObject getStudentJSON(Student student) {
        JSONObject studentDetails = new JSONObject();
        studentDetails.put(USER_FIRST_NAME, student.getFirstName());
        studentDetails.put(USER_LAST_NAME, student.getLastName());
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
            jsonExperience.put(USER_TITLE, experiences.get(i).getTitle());
            jsonExperience.put(USER_COMPANY, experiences.get(i).getCompany());
            jsonExperiences.add(jsonExperience);
        }
        studentDetails.put(USER_EXPERIENCE, jsonExperiences);
        return studentDetails;
    }

    /**
     * This public static method saves our resume JSON and is used in jsonResumes.
     */
    public static void saveResume() {
        Resume resume = Resume.getInstance();
        ArrayList<Resume> resumes = resume.getResume();
        JSONArray jsonResumes = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < resumes.size(); i++) {
            jsonResumes.add(getResumeJSON(resumes.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonResumes.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This private static method gets our resume JSON and is used in the save
     * resume method.
     * 
     * @param resume is the appropriate resume and assigned to resumeDetails.
     */
    private static JSONObject getResumeJSON(Resume resume) {
        JSONObject resumeDetails = new JSONObject();
        // NOT NEEDED resumeDetails.put(USER_STUDENT_INFO, resume.getStudentInfo());
        // resumeDetails.put(USER_MAJOR, resume.getMajor());
        ArrayList<String> skills = resume.getSkills();
        JSONArray jsonSkills = new JSONArray();
        for (int i = 0; i < skills.size(); i++) {
            jsonSkills.add(skills.get(i));
        }
        resumeDetails.put(USER_SKILLS, jsonSkills);

        ArrayList<Experience> experiences = resume.getExperience();
        JSONArray jsonExperiences = new JSONArray();
        for (int i = 0; i < experiences.size(); i++) {
            JSONObject jsonExperience = new JSONObject();
            // jsonExperience.put(); //CHECK
            jsonExperiences.add(jsonExperience);
        }
        resumeDetails.put(USER_EXPERIENCE, jsonExperiences);

        ArrayList<Education> education = resume.getEducation();
        JSONArray jsonEducations = new JSONArray();
        for (int i = 0; i < education.size(); i++) {
            JSONObject jsonEducation = new JSONObject();
            // jsonExperience.put(); //CHECK
            jsonExperiences.add(jsonEducation);
        }
        resumeDetails.put(USER_EDUCATION, jsonEducations);
        return resumeDetails;
    }

    /**
     * This public static method saves our employer JSON and is used in jsonResumes.
     */
    public static void saveEmployer() {
        UserList employer = UserList.getInstance();
        ArrayList<Employer> employers = employer.getEmployers();
        JSONArray jsonEmployers = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < employers.size(); i++) {
            jsonEmployers.add(getEmployerJSON(employers.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonEmployers.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This private static method gets our resume JSON and is used in the save
     * employer method.
     * 
     * @param employer is the appropriate employer and assigned to employerDetails.
     */
    public static JSONObject getEmployerJSON(Employer employer) {
        JSONObject employerDetails = new JSONObject();
        employerDetails.put(USER_FIRST_NAME, employer.getFirstName());
        employerDetails.put(USER_LAST_NAME, employer.getLastName());
        employerDetails.put(USER_USER_NAME, employer.getUserName());
        employerDetails.put(USER_EMAIL, employer.getEmail());
        ArrayList<String> internshipsOffered = employer.getInternshipsOffered();
        JSONArray jsonInternshipsOffered = new JSONArray();
        for (int i = 0; i < internshipsOffered.size(); i++) {
            jsonInternshipsOffered.add(internshipsOffered.get(i));
        }
        employerDetails.put(USER_INTERNSHIPS_OFFERED, jsonInternshipsOffered);

        return employerDetails;
    }

    /**
     * This public static method saves our internships JSON and is used in
     * jsonResumes.
     */
    public static void saveInternships() {
        InternshipList internship = InternshipList.getInstance();
        ArrayList<Internships> internships = internship.getInternships();
        JSONArray jsonInternships = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < internships.size(); i++) {
            jsonInternships.add(getInternshipsJSON(internships.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonInternships.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getInternshipsJSON(Internships internship) {
        JSONObject internshipDetails = new JSONObject();
        internshipDetails.put(USER_ID, internship.getID());
        internshipDetails.put(USER_TITLE, internship.getTitle());
        internshipDetails.put(USER_DESCRIPTION, internship.getDescription());
        internshipDetails.put(USER_RATING, internship.getEmployerRating());
        internshipDetails.put(USER_LOCATION, internship.getLocation());
        ArrayList<String> skillsRequired = internship.getSkillsRequired();
        JSONArray jsonSkillsRequired = new JSONArray();
        for (int i = 0; i < skillsRequired.size(); i++) {
            jsonSkillsRequired.add(skillsRequired.get(i));
        }
        internshipDetails.put(USER_SKILLS_REQUIRED, jsonSkillsRequired);
        internshipDetails.put(USER_IN_PERSON, internship.getInPerson());
        internshipDetails.put(USER_REMOTE, internship.getRemote());
        return internshipDetails;
    }

    /**
     * This public static method saves the admin JSON and is used in jsonResumes.
     */
    public static void saveAdmin() {

        UserList admin = UserList.getInstance();
        ArrayList<Admin> admins = admin.getAdmins();
        JSONArray jsonAdmins = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < admins.size(); i++) {
            jsonAdmins.add(getAdminsJSON(admins.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonAdmins.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This private static method gets our admin JSON and is used in the save admin
     * method.
     * 
     * @param admin is the appropriate admin and assigned to adminDetails.
     */
    public static JSONObject getAdminsJSON(Admin admin) {
        JSONObject adminDetails = new JSONObject();
        adminDetails.put(USER_ID, admin.getID());
        adminDetails.put(USER_FIRST_NAME, admin.getFirstName());
        adminDetails.put(USER_LAST_NAME, admin.getLastName());
        adminDetails.put(USER_USER_NAME, admin.getUserName());
        adminDetails.put(USER_EMAIL, admin.getEmail());
        return adminDetails;
	}
    
    public static void toTextFile() {
        Resume resume = Resume.getInstance();
        ArrayList<Resume> resumes = resume.getResume();
        JSONArray jsonResumes = new JSONArray();
<<<<<<< HEAD
         Scanner sc = new Scanner(System.in);
=======
        Scanner sc = new Scanner(System.in);
>>>>>>> 0313da9815b1e29830d9c0ae88381a9144ca39d7
        for(int i = 0; i < resumes.size(); i++) {
        //https://stackoverflow.com/questions/26165386/producing-some-text-file-using-a-for-loop-in-java
        try {
        FileWriter f = new FileWriter("textfile.txt");
        f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
   }
}
