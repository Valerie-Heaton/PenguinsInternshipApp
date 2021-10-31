/**
 * This is the stub for the student program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
import java.util.UUID;

public class Student {
    //adding UUID
    private UUID id;
    //add UUID
    String firstName;
    String lastName;
    String userName;
    String email;
    //added
    ArrayList<Internships> internshipsApplied;
    String major;
    ArrayList<String> courses;
    ArrayList<String> experience;
    ArrayList<String> education;
   /**
   *this is an constructor that will initialize all of our variables 
   *
   @firstName will construct the users fist first name
   @lastName will construct the users last name
   @username will construct the users username
   @email will construct the users email
   */

    //instance setting up random ID
    public Student(String firstName, String lastName, String userName, String email, ArrayList<Internships> internshipsApplied, String major, ArrayList<String> courses, ArrayList<String> experience, ArrayList<String> education) {
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
    }

    //instance of Student WITH the random ID

    public Student(UUID id, String firstName, String lastName, String userName, String email, String major) {
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
   public User addInternshipRating(User rater, int rating, String comment) {
       return rater;
   }
   /**
   *this method will allow the user to insert their Resume
   */
   public void insertResume() {
      Resume insertResume = new Resume(major, email);
   }

   }
    