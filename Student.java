/**
 * This is the stub for the student program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
public class Student {

    String firstName;
    String lastName;
    String userName;
    String email;
    ArrayList<Internships> internshipsApplied;
   /**
   *this is an constructor that will initialize all of our variables 
   @firstName will construct the users fist first name
   @lastName will construct the users last name
   @username will construct the users username
   @email will construct the users email
   */
    public Student(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }
   /**
   * this method will show all the internships offfered
   */
   public internshipsOffered(Internships internships) {
     return internships;  
   }
   /**
   *this method will add the students rating on the internship program
   */
   public addInternshipRating(User rater, int rating, String comment) {
       return rater;
   }
   /**
   *this method will allow the user to insert their Resume
   */
   public Resume insertResume() {
    return;
   }
   }
    