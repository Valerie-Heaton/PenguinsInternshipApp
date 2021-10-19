/**
* This is the stub for the admin program.
* 
* @author Siri, Maddie, Valerie, Ali
*/

public class Admin {
/**
* The admin class private variable(s) for the 'admin' stub
*/
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private String title;
    private String description;
    private String location;

    public Admin() {}
    /**
    * The void that identifies the new variables and adds the title, desc. and location of the job
    */
    public void addInternship(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;

    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's first name
    */
    public void editFirstName(int UserID, String firstName) {
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's last name
    */
    public void editLastName(int UserID, String lastName) {
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's username
    */
    public void editUserName(int UserID, String userName) {
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's email
    */
    public void editEmail(int UserID, String email) {
        // empty, for now
    }
    /**
    * Returns nothing, though utilizes the UserID to delete an internship entry
    */
    public void deleteInternship(int UserID) {
        // empty, for now
    }
    
}
