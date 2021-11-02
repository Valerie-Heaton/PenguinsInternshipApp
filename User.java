/**
* This is the stub for the user program.
* 
* @author Siri, Maddie, Valerie, Ali
*/
import java.util.*;
import java.util.UUID;

public abstract class User {

    public User(UUID id, String firstName, String lastName, String userName, String email) {}
    // public void getInternships();
    // /**
    //  * Runs the array list containing internships that soon returns back an internship entry to the user
    //  */
    // public Internships getInternships(Internships internship) {
    //     return internship;
    // }
    public abstract void getFirstName();
    public abstract void getLastName();
    public abstract void getUserName();
    public abstract void getPassword();
    public abstract void getEmail();

    // MAKE IT ALL ITALICIZED IN UML BC ABSTRACT 

}
