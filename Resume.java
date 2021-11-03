/**
 * Resume class holds all of the data for the Student's resume.
 * Data includes general info about the student, the student's major,
 * experience, and courses. Works with the Application interface.
 */

import java.util.ArrayList;

public class Resume {

   private Student studentInfo;
   public static Resume resume;
   // Student and studentInfo will throw an error until the Student class is made
   private String major;
   private ArrayList<Resume> resumes;
   private ArrayList<String> courses;
   private ArrayList<Experience> experience;
   private ArrayList<String> skills;
   private ArrayList<Education> education;

   public Resume(String skills, Education education, ArrayList<Experience> experience) {
      this.studentInfo = studentInfo;
      this.major = major;
      this.courses = new ArrayList<String>();
      this.experience = new ArrayList<Experience>();
      this.skills = new ArrayList<String>();
      this.education = new ArrayList<Education>();
      this.resumes = new ArrayList<Resume>();
   }

    public Resume() {}

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

    public ArrayList<Resume> getResumes() {
        return this.resumes;
    }


}
