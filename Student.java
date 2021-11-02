/**
 * This is the stub for the student program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    //adding UUID
    private UUID id;
    //add UUID
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Resume resume;
    //added
    private ArrayList<Internships> internshipsApplied;
    private String major;
    private ArrayList<String> courses;
    private ArrayList<Experience> experience;
    private ArrayList<String> education;
   /**
   *this is an constructor that will initialize all of our variables 
   *
   @firstName will construct the users fist first name
   @lastName will construct the users last name
   @username will construct the users username
   @email will construct the users email
   */

    public Student(String firstName, String lastName, String userName, String password, String email) {
     super(firstName, lastName, userName, password, email);
     this.id = UUID.randomUUID();
     this.firstName = firstName;
     this.lastName = lastName;
     this.userName = userName;
     this.email = email;
     this.internshipsApplied = internshipsApplied;
     this.major = major;
     this.courses = courses;
     this.experience = experience;
     this.education = education;
     this.password = password;
   }

    //instance of Student WITH the random ID
    public Student(UUID id, String firstName, String lastName, String userName, String password, String email) {
      super(firstName, lastName, userName, password, email);
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.userName = userName;
      this.email = email;
      this.internshipsApplied = internshipsApplied;
      this.major = major;
      this.courses = courses;
      this.experience = experience;
      this.education = education;
      this.password = password;
      this.resume = new Resume();
    }

    
    //get the ID
    public UUID getId() {
      return id;
    }

  /**
   * this method will show all the internships offfered
   * @return 
   */
   public Internships internshipsOffered(Internships internships) {
     return internships;  
   }
   /**
   *this method will add the students rating on the internship program
 * @return 
   */
   public User addInternshipRating(User rater, Rating rating, String comment) {
       return rater;
   }
   /**
   *this method will allow the user to insert their Resume
   */
   public Resume getResume() {
      return this.resume;
   }

   // ADDED IN THIS METHOD BC OF DATA WRITER
  public static Student getInstance() {
      //Siri
      return null;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getEmail() {
      return this.email;
  }

//Out for now. What does this connect to?
//public ArrayList<Student> getStudentUsers() {
    //return null;
//}

  public ArrayList<String> getCourses() {
    return this.courses;
  }

  public ArrayList<Experience> getExperiences() {
      return this.experience;
  }

  public String getLastName() {
      return this.lastName;
  }

  @Override
  public String getUserName() {
    return this.userName;
  }

  @Override
  public String getPassword() {
    return this.password;
  }
  
}
    