import java.util.*;
/**
 * This is the class for the actual Internships display.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
public class Internships {

    /**
     * These are all instance variables used within this class.
     */
    private String title; 
    private ArrayList<Rating> employerRating;
    private String description;
    private String location;
    private boolean online;
    private boolean remote; 
    private Search search = new Search();
    private String skillsRequired;


    /**
     * This is the constructor for the internship class
     * @param title the title of the internship
     * @param description the description of the internship
     * @param location the loaction of the internship
     */
    public Internships(String title, String description, String location) { // possibly need to add more parameters
        this.title = title;
        this.employerRating = new ArrayList<Rating>();
        this.description = description;
        this.location = location;
        this.online = online;
        this.remote = remote;
        this.skillsRequired = skillsRequired;
        this.search= search;
    }

    /**
     * This method is the accessor for the employer rating.
     * @return ArrayList of the employer ratings
     */
    public ArrayList<Rating> getEmployerRating() {
        return this.employerRating;
    }

    /**
     * This method is the accessor for the description.
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * This method is the accessor for the location.
     * @return the location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * This method is the accessor for seeing if the internship is in person or not.
     * @return true for in person and false if not in person
     */
    public boolean getInPerson() {
        return this.online;
    }

    /**
     * This method is the accessor for seeing if the internship is remote or not.
     * @return true for remote and false if not remote
     */
    public boolean getRemote() {
        return this.remote;
    }
    
    /**
     * This method is the accessor for  our search function.
     * @return an instance of the object Search
     */
    public Search getSearch() {
        return this.search;
    }

    /**
     * This method is the accessor for the skills required for the internship.
     * @return skills required for the internship
     */
    public String getSkillsRequired() {
        return this.skillsRequired;
    }


    // maybe we need a String toString method
}