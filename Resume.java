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

<<<<<<< HEAD
     public static Resume resume;
    private Student studentInfo; 
=======
   // Student and studentInfo will throw an error until the Student class is made
>>>>>>> bfa08382ae5c9efe942aeb5e908395ac79c98de3

   private String major;
   private ArrayList<String> courses;
   private ArrayList<Experience> experience;
   private ArrayList<String> skills;
   private ArrayList<Education> education;

   // create instances

<<<<<<< HEAD
     //create instances

     public Resume() {
         this.studentInfo = studentInfo;
         this.major = major;
         this.courses = new ArrayList<String>();
         this.experience = new ArrayList<Experience>();
         this.skills = new ArrayList<String>();
         this.education = new ArrayList<Education>();
     }

     public Student getStudentInfo() {
=======
   public Resume(String major, String experience) {
      this.studentInfo = new Student();
      this.major = major;
      this.courses = new ArrayList<String>();
      this.experience = new ArrayList<Experience>();
      this.skills = new ArrayList<String>();
      this.education = new ArrayList<Education>();
   }

   // returns for each 'this'
   public String getStudentInfo() {
>>>>>>> bfa08382ae5c9efe942aeb5e908395ac79c98de3
      return this.studentInfo;
     }

   public String getMajor() {
      return this.major;
   }

   public ArrayList<String> getCourses() {
      return this.courses;
   }

   public Experience getExperience() {
      return this.experience;
   }

<<<<<<< HEAD
     public ArrayList<Experience> getExperience() {
        return this.experience;
     }

     public ArrayList<String> getSkills() {
        return this.skills;
     }

     public ArrayList<Education> getEducation() {
=======
   public static ArrayList<String> getSkills() {
      return this.skills;
   }

   public ArrayList<Education> getEducation() {
>>>>>>> bfa08382ae5c9efe942aeb5e908395ac79c98de3
      return this.education;
     }

<<<<<<< HEAD
   public static Resume getInstance() {
      if (resume == null) {
         resume = new Resume();
      }
      return resume;
   }
 }
=======
   public static Student getInstance() {
      return null;
   }
}
>>>>>>> bfa08382ae5c9efe942aeb5e908395ac79c98de3
