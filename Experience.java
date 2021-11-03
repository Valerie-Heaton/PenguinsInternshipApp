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
    private String experienceDescription;

    /**
     * This method initializes each of the objects that are necessary 
     * for Experience and intializes the String description for experience.
     * @param title is a title of the Entry Title.
     * @param company is a company of the employer's business.
     * @param volunteerExperience is an ArrayList of Volunteer Experience
     * @param workExperience is an ArrayList of Work Experience
     * @param pastEmployers is an ArrayList of the Past Employers
     */
    public Experience(String title, String company) {
        this.title = title;
        this.company = company;
        this.volunteerExperience = new ArrayList<String>();
        this.workExperience = new ArrayList<String>();
        this.pastPositions = new ArrayList<String>();
        //this.experienceDescription = experienceDescription;
    }
    /**
     * This calls volunteerExperience from the children classes
     * @return returns the volunteerExperience variable.
     */
    public ArrayList<String> getVolunteerExperience() {
        return this.volunteerExperience;
    }

    /**
     * This calls workExperience from the children classes
     * @return returns the workExperience variable.
     */
    public ArrayList<String> getWorkExperience() {
        return this.workExperience;
    }

    /**
     * This calls pastPositions from the children classes
     * @return returns the pastPositions variable.
     */
    public ArrayList<String> getPastPositions() {
        return this.pastPositions;
    }

    /**
     * This calls experienceDescription from the children classes
     * @return returns the experienceDescription variable.
     */
    public String getExperienceDescription() {
        return this.experienceDescription;
    }

    /**
     * This calls title from the children classes
     * @return returns the title variable.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This calls company from the children classes
     * @return returns the company variable.
     */
    public String getCompany() {
        return company;
    }

}