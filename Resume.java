/**
 * Resume class holds all of the data for the Student's resume.
 * Data includes general info about the student, the student's major,
 * experience, and courses. Works with the Application interface.
 */

//need ArrayList for skills and courses
import java.util.ArrayList;

public class Resume {

   // 'implements Application' will be added later
   // Application will throw an error until the Application interface is made

   // private variables

   private Student studentInfo;
   public static Resume resume;
   // Student and studentInfo will throw an error until the Student class is made

   private String major;
   private ArrayList<String> courses;
   private ArrayList<Experience> experience;
   private ArrayList<String> skills;
   private ArrayList<Education> education;

   // create instances

     //create instances

     public Resume() {
        this.studentInfo = studentInfo;
        this.major = major;
        this.courses = new ArrayList<String>();
        this.experience = new ArrayList<Experience>();
        this.skills = new ArrayList<String>();
        this.education = new ArrayList<Education>();
      }
      /**
      * This calls the getStudentInfo method from the children classes
      */   
      public Student getStudentInfo() {
         return this.studentInfo;
      }
      /**
      * This calls the getMajor method from the children classes
      */   
      public String getMajor() {
         return this.major;
      }
      /**
      * This calls the getCourses method from the children classes
      */   
      public ArrayList<String> getCourses() {
         return this.courses;
      }
      /**
      * This calls the getExperience method from the children classes
      */   
      public ArrayList<Experience> getExperience() {
         return this.experience;
      }
      /**
      * This calls the getSkills method from the children classes
      */   
      public ArrayList<String> getSkills() {
         return this.skills;
      }
      /**
      * This calls the getEducation method from the children classes
      */   
      public ArrayList<Education> getEducation() {
         return this.education;
      }
      /**
      * This calls the getInstance method from the children classes
      */   
      public static Resume getInstance() {
         if (resume == null) {
            resume = new Resume();
         }
         return resume;
      }
      /**
      * This calls the getResume method from the children classes
      */   
      public ArrayList<Resume> getResume() {
         return null;
      }  
}
