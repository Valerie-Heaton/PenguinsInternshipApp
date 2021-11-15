/**
 * This is the employer class we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
import java.util.UUID;

public class Employer extends User  {
  /**
   * These are the private variables for the Employer class
   */
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private ArrayList<Internships> internshipsOffered;
    
  /**
   * this is a constructor that will initialize all of our variables 
   * @param firstName will construct the users fist first name
   * @param lastName will construct the users last name
   * @param userName will construct the users username
   * @param email will construct the users email
   * @param password will construct the password
   */
    public Employer(String firstName, String lastName, String userName, String password, String email) {
        super(firstName, lastName, userName, email, password);
        id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        //this.internshipsOffered = internshipsOffered;
    }

  /**
   * This is a constructor that will initialize all of our variables 
   * @param id will construct the users id
   * @param firstName will construct the users fist first name
   * @param lastName will construct the users last name
   * @param userName will construct the users username
   * @param email will construct the users email
   * @param password will construct the password
   */
    public Employer(UUID id, String firstName, String lastName, String userName, String password, String email) {
      super(firstName, lastName, userName, email, password);
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.userName = userName;
      this.email = email;
      this.password = password;
      //this.internshipsOffered = internshipsOffered;
    }
    
    /**
     * This gets the ID.
     * @return returns the id.
     */
    public UUID getId() {
      return id;
    }
  
   /**
   * This method will allow the employer to add an internship entry.
   */
   public ArrayList<Internships> getInternshipsOffered() {
     return this.internshipsOffered;  
   }

   /**
   * This method will add the employer's rating to the internship program.
   */
   public User addInternshipRating(User rater, int rating, String comment) {
    return rater;
   }
   
    /**
     * @Override indicates this child class is overwriting the employer base class.
     * @return returns the firstName self-identifier to fetch the firstName variable
     */
    @Override
    public String getFirstName() {
      return this.firstName;
    }

    /**
     * @Override indicates this child class is overwriting the employer base class.
     * @return returns the lastName self-identifier to fetch the lastName variable
     */
    @Override
    public String getLastName() {
      return this.lastName;
    }

    /**
     * @Override indicates this child class is overwriting the employer base class.
     * @return returns the userName self-identifier to fetch the userName variable
     */
    @Override
    public String getUserName() {
      return this.userName;
    }

    /**
     * @Override indicates this child class is overwriting the employer base class.
     * @return returns the password self-identifier to fetch the password variable
     */
    @Override
    public String getPassword() {
      return this.password;
    }

    /**
     * @Override indicates this child class is overwriting the employer base class.
     * @return returns the email self-identifier to fetch the email variable
     */
    @Override
    public String getEmail() {
      return this.email;
    }

}
