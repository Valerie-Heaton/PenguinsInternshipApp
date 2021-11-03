/**
 * This is the stub for the student program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
  /**
   * The private variables for the Student class
   */
    //adding UUID
    private UUID id;
    //add UUID
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private ArrayList<Internships> internshipsApplied;
    private String major;
    private ArrayList<String> courses;
    private ArrayList<Experience> experience;
    private ArrayList<String> education;
    private Resume resume;

   /**
   * This is the Student constructor that will initialize the following variables.
   * @param firstName is a String and will construct the user's fist first name.
   * @param lastName is a String and will construct the user's  last name.
   * @param username is a String and will construct the user's username.
   * @param password is a String and will construct the user's password.
   * @param email is a String and will construct the user's email.
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
     this.resume = resume;
   }

    //instance of Student WITH the random ID
    /**
     * This is the Student constructor that will initialize the following variables.
     * @param id is the appropriate UUID and is assigned to the this.id.
     * @param firstName is the appropriate String and is assigned to the this.firstName.
     * @param lastName is the appropriate String and is assigned to the this.lastName.
     * @param userName is the appropriate String and is assigned to the this.userName.
     * @param password is the appropriate String and is assigned to the this.password.
     * @param email is the appropriate String and is assigned to the this.email.
     */
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
      this.resume = resume;
    }

    //maddie
    /**
     * Gets the ID
     * @return the ID variable
     */
    public UUID getId() {
      return id;
    }

  /**
  * This calls the internshipsOffered method, displaying the internships offered.
  * @return returns the internship entries available.
  */
   public Internships internshipsOffered(Internships internships) {
     return internships;  
   }
   
  /**
  * This calls the internshipRating method, allowing students to rate the internship entry.
  * @return returns the rater variable, which is the appropriate User.
  */
   public User addInternshipRating(User rater, Rating rating, String comment) {
       return rater;
   }

  /**
  * This calls the resume method, allowing students to fetch their resume.
  * @return returns the resume variable, which is the appropriate Resume.
  */
   public Resume getResume() {
      return this.resume;
   }

   // ADDED IN THIS METHOD BC OF DATA WRITER

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

  /**
   * This method fetches for the user's courses.
   * @return returns the courses variable.
   */
  public ArrayList<String> getCourses() {
    return this.courses;
  }

  /**
   * This method fetches for the user's vocational experience.
   * @return returns the experience variable.
   */
  public ArrayList<Experience> getExperiences() {
      return this.experience;
  }

  /**
   * This method fetches for the user's last name.
   * @return returns the lastName variable.
   */
  public String getLastName() {
      return this.lastName;
  }

  /**
   * This method fetches for the user's user name.
   * @return returns the userName variable.
   * @Override indicates this child class is overwriting the student base class.
   */  
  @Override
  public String getUserName() {
    return this.userName;
  }

  /**
   * This method fetches for the user's password.
   * @return returns the password variable.
   * @Override indicates this child class is overwriting the student base class.
   */    
  @Override
  public String getPassword() {
    return this.password;
  }

  /**
   * This is the Array List that displays the internships a user has applied to.
   * @return returns the list of internships applied.
   */
  public ArrayList<Internships> internshipsApplied() {
     return this.internshipsApplied;
  }
  
  
}
    