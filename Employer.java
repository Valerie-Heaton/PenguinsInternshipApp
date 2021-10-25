/**
 * This is the employer class we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
public class Employer  {

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
    public Employer(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }
   /**
   * this method will enable the employer to add an internship
   */
   public void addInternshipsOffered(Internships internships) {
     return;  
   }
   /**
   *this method will add the employers rating on the internship program
   */
   public void addInternshipRating(User rater, int rating, String comment) {
       return;
   }
   
   }
    