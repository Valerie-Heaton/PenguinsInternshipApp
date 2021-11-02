/**
 * This is the employer class we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
import java.util.UUID;

public class Employer extends User  {
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private ArrayList<Internships> internshipsOffered;
   /**
   *this is an constructor that will initialize all of our variables 
   @firstName will construct the users fist first name
   @lastName will construct the users last name
   @username will construct the users username
   @email will construct the users email
   @internshipsOffered will construct the internships being offered
   */
    public Employer(UUID id, String firstName, String lastName, String userName, String email) {
        super(id, firstName, lastName, userName, email);
        id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.internshipsOffered = internshipsOffered;
    }

    public Employer(UUID id, String firstName, String lastName, String userName, String email) {
      //super(id, firstName, lastName, userName, email);
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.userName = userName;
      this.email = email;
      this.internshipsOffered = internshipsOffered;
    }

  
   /**
   * this method will enable the employer to add an internship
   */
   public Internships addInternshipsOffered(Internships internships) {
     return internships;  
   }
   public User addInternshipRating(User rater, int rating, String comment) {
    return rater;
  }
   /**
   *this method will add the employers rating on the internship program
   */

   
   }
    