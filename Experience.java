/**
 * The Experience class that will be used to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */

import java.util.*;

public class Experience {
    /**
    * These are the private variables for the Experience class.
    */
    //maddie
    private String title;
    private String company;
    private ArrayList<String> volunteerExperience;
    private ArrayList<String> workExperience;
    private ArrayList<String> pastPositions;
    private String createdDescription;
    private String date;
    private String positionDescription;
    private String internship;

    /**
     * This method initializes each of the ArrayLists that are necessary for Experience and intializes the String description for experience.
     * @param volunteerExperience is an ArrayList of Volunteer Experience
     * @param workExperience is an ArrayList of Work Experience
     * @param pastEmployers is an ArrayList of the Past Employers
     */
    public Experience(String title, String company, String internship, String date, String createdDescription, String positionDescription) {
        this.title = title;
        this.company = company;
        this.date = date;
        this.internship = internship;
        this.createdDescription = createdDescription;
        this.positionDescription = positionDescription;
        this.volunteerExperience = new ArrayList<String>();
        this.workExperience = new ArrayList<String>();
        this.pastPositions = new ArrayList<String>();
        //this.experienceDescription = experienceDescription;
    }
    /**
     * This calls the getVolunteerExperience method from the children classes
     */
    public ArrayList<String> getVolunteerExperience() {
        return this.volunteerExperience;
    }
    /**
     * This calls the getWorkExperience method from the children classes
     */    
    public ArrayList<String> getWorkExperience() {
        return this.workExperience;
    }
    /**
     * This calls the getPastPositions method from the children classes
     */
    public ArrayList<String> getPastPositions() {
        return this.pastPositions;
    }
    /**
     * This calls the getExperienceDescription method from the children classes
     */
    public String getCreatedDescription() {
        return this.createdDescription;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDate() {
        return this.date;
    }

    public String getProjectDescription() {
        return this.positionDescription;
    }
}