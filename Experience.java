/**
 * EXPERIENCE LIST 
 * make another object with experience (title, etc)
 * This is the experience stub we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */

import java.util.*;

public class Experience {

    private ArrayList<String> volunteerExperience;
    private ArrayList<String> workExperience;
    private ArrayList<String> pastPositions;
    private String experienceDescription;

    /**
     * This method initializes each of the ArrayLists that are necessary for Experience and intializes the String description for experience.
     * @param volunteerExperience is an ArrayList of Volunteer Experience
     * @param workExperience is an ArrayList of Work Experience
     * @param pastEmployers is an ArrayList of the Past Employers
     */
    public Experience(ArrayList<String> volunteerExperience, ArrayList<String> workExperience, ArrayList<String> pastEmployers) {
        this.volunteerExperience = new ArrayList<String>();
        this.workExperience = new ArrayList<String>();
        this.pastPositions = new ArrayList<String>();
        this.experienceDescription = experienceDescription;
    }

    public ArrayList<String> getVolunteerExperience() {
        return this.volunteerExperience;
    }
    
    public ArrayList<String> getWorkExperience() {
        return this.workExperience;
    }

    public ArrayList<String> getPastPositions() {
        return this.pastPositions;
    }

    public String getExperienceDescription() {
        return this.experienceDescription;
    }

}