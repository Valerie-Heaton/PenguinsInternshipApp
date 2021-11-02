/**
* This is the stub for the admin program.
* 
* @author Siri, Maddie, Valerie, Ali
*/
import java.util.UUID;

public class Admin extends User {
/**
* The admin class private variable(s) for the 'admin' stub
*/
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String title;
    private String description;
    private String location;


    public Admin(String firstName, String lastName, String userName, String email) {
        super(firstName, lastName, userName, email);
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public Admin(UUID id, String firstName, String lastName, String userName, String email) {
        //super(id, firstName, lastName, userName, email);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }
    
    /**
    * The void that identifies the new variables and adds the title, desc. and location of the job
    */
    public void addInternship(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;

    }

    //added toString methdod
    public String toString() {
        return description;
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's first name
    */
    public void editFirstName(int UserID, String firstName) {
        this.firstName.replace(this.firstName, firstName);
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's last name
    */
    public void editLastName(int UserID, String lastName) {
        this.lastName.replace(this.lastName, lastName);
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's username
    */
    public void editUserName(int UserID, String userName) {
        this.userName.replace(this.userName, userName);
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's email
    */
    public void editEmail(int UserID, String email) {
        this.email.replace(this.email, email);
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to delete an internship entry
    */
    
    public void deleteInternship(int UserID) {
       
        // empty, for now
    }
    
}
