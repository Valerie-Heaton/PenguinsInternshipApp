/**
 * Resume class holds all of the data for the Student's resume.
 * Data includes general info about the student, the student's major,
 * experience, and courses. Works with the Application interface.
 */


 //need ArrayList for skills and courses
 import java.util.ArrayList;

 public class Resume {

    // 'implements Application' will be added later
    //Application will throw an error until the Application interface is made

     //private variables

    private Student studentInfo; 

    //Student and studentInfo will throw an error until the Student class is made

     private String major;
     private ArrayList<String> courses;
     private String experience;
     private ArrayList<String> skills;

     //create instances

     public Resume(Student studentInfo, String major, ArrayList<String> courses, String experience, ArrayList<String> skills) {
         studentInfo = this.studentInfo;
         major = this.major;
         courses = this.courses;
         experience = this.experience;
         skills = this.skills;
     }

     //returns for each 'this'

     public String getMajor() {
        return this.major;
     }

     public ArrayList<String> getCourses() {
        return this.courses;
     }

     public String getExperience() {
        return this.experience;
     }

     public ArrayList<String> getSkills() {
        return this.skills;
     }
 }