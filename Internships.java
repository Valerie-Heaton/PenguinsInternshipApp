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
    private UUID id;
    private String title; 
    private ArrayList<Rating> employerRating;
    private String description;
    private String location;
    private boolean inPerson;
    private boolean remote; 
    private ArrayList<String> skillsRequired;


    /**
     * This is the constructor for the internship class
     * @param title the title of the internship
     * @param description the description of the internship
     * @param location the loaction of the internship
     */
    public Internships(UUID id, String title, String description, String location, boolean inPerson, boolean remote) { // possibly need to add more parameters
        id = UUID.randomUUID();
        this.title = title;
        this.employerRating = new ArrayList<Rating>();
        this.description = description;
        this.location = location;
        this.inPerson = inPerson;
        this.remote = remote;
        //this.skillsRequired = skillsRequired;
        //this.search = search; 
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
        return this.inPerson;
    }

    /**
     * This method is the accessor for seeing if the internship is remote or not.
     * @return true for remote and false if not remote
     */
    public boolean getRemote() {
        return this.remote;
    }

    /**
     * This method is the accessor for the skills required for the internship.
     * @return skills required for the internship
     */
    public ArrayList<String> getSkillsRequired() {
        return this.skillsRequired;
    }

    /**
     * This method defines the necessary skills required for an internship.
     * @return returns true if the skills the user is capable of applies to the
     * skills required.
     */
    public boolean contains(String keyword) {
        for (int i = 0; i < skillsRequired.size(); i++) {
            if (skillsRequired.get(i).equalsIgnoreCase(keyword)) {
                System.out.println(skillsRequired);
                return true;
            }
        }

        if (title.contains(keyword)) {
            return true;
        }

        else {
            return false;
        }
    }

    // maybe we need a String toString method
    /**
     * Gets the ID.
     * @return returns the ID variable.
     */
    public UUID getID() {
        return this.id;
    }

    /**
     * Gets the title.
     * @return returns the title variable.
     */
    public String getTitle() {
        return this.title;
    }
    
}