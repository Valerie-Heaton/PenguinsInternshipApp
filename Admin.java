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
    private String password;
    private String title;
    private String description;
    private String location;
    private Internships internship;


    public Admin(String firstName, String lastName, String userName, String password, String email) {
        super(firstName, lastName, userName, password, email);
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Admin(UUID id, String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    // get the ID
    public UUID getId() {
        return id;
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
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's last name
    */
    public void editLastName(int UserID, String lastName) {
        this.lastName.replace(this.lastName, lastName);
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's username
    */
    public void editUserName(int UserID, String userName) {
        this.userName.replace(this.userName, userName);
    }
    /**
    * Returns nothing, though utilizes the UserID to 'edit' a user's email
    */
    public void editEmail(int UserID, String email) {
        this.email.replace(this.email, email);
    }
    /**
    * Returns nothing, though utilizes the UserID to 'delete' an internship entry
    */
    
    public void deleteInternship(int UserID, Internships internship) {     
        // empty, for now
        this.internship.equals(null);
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return this.firstName;
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return this.lastName;
    }

    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return this.userName;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return this.email;
    }
    
}
