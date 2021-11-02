/**
* This is the Admin class we will use to implement the User program.
* 
* @author Siri, Maddie, Valerie, Ali
*/
import java.util.UUID;

public class Admin {
    /**
    * The admin class private variable(s) for the 'admin' class
    */
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String title;
    private String description;
    private String location;

    /**
     * This the constructor for the Admin class
     * @param id is the appropriate UUID and is assigned to the UUID.
     * @param firstName is the appropriate String and is assigned to the UUID.
     * @param lastName is the appropriate String and is assigned to the UUID.
     * @param userName is the appropriate String and is assigned to the UUID.
     * @param email is the appropriate String and is assigned to the UUID.
     */
    public Admin(UUID id, String firstName, String lastName, String userName, String email) {
        id = UUID.randomUUID();
    }
    
    /**
    * The void that identifies the new variables and adds the title, desc. and location of the job
    * @param title is the appropriate String and is assigned to the this.title.
    * @param description is the appropriate String and is assigned to the this.description.
    * @param location is the appropriate String and is assigned to the this.location.
    */
    public void addInternship(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;

    }

    //added toString method
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
    * Returns nothing, though utilizes the UserID to 'delete' an internship entry
    */
    public void deleteInternship(int UserID) {
       
        // empty, for now
    }
    
}
