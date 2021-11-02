/**
 * This is the Education class we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */

import javax.net.ssl.TrustManager;

//needs json?

public class Education {
    /**
     * These are instance variables of the types 'String' and 'int'.
     */
    private String schoolEducationReceived;
    private int yearGraduated;
    private String major;

    /**
     * This the constructor for the Education class.
     * @param schoolEducationReserved is the appropriate String and is assigned to this.schoolEducationReceived.
     * @param major is the appropriate String and is assigned to this.major.
     * @param yearGraduated is the appropriate integer to this.yearGraduated.
     */
    public Education(String schoolEducationReserved, String major, int yearGraduated) {
        //this.schoolEducationReceived = schoolEducationReceived; //what does this do?
        this.yearGraduated = yearGraduated;
        this.major = major;
    }
    /**
     * This calls the schoolEducationReceived method from the children classes
     */
    public String getSchoolEducationReceived() {
        return this.schoolEducationReceived;
    }
    /**
     * This calls the yearGraduated method from the children classes
     */
    public int getYearGraduated() {
        return this.yearGraduated;
    }
    /**
     * This calls the major method from the children classes
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * This checks if the school education received is a valid index and executes the corresponding command.
     * @return returns a boolean value based on whether or not the index is valid
     */
    public boolean checkSchoolEducationReceived() {
        if (this.schoolEducationReceived.equalsIgnoreCase("UofSC") || this.schoolEducationReceived.equalsIgnoreCase("The University of South Carolina") || this.schoolEducationReceived.equalsIgnoreCase("University of South Carolina") || this.schoolEducationReceived.equalsIgnoreCase("USC")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This checks if yearGraduated is a valid index and executes the corresponding command.
     * @param yearGraduated is the index of the ArrayList
     * @return returns a boolean value based on whether or not the index is valid.
     */
    public boolean checkYearGraduated() {
        if (this.yearGraduated == 2022 || this.yearGraduated == 2023 || this.yearGraduated == 2024 || this.yearGraduated == 2025) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This checks if yearGraduated is a valid index and executes the corresponding command.
     * @param yearGraduated is the index of the ArrayList
     * @return returns a boolean value based on whether or not the index is valid.
     */
    public boolean checkMajor() {
        if (this.yearGraduated == 2022 || this.yearGraduated == 2023 || this.yearGraduated == 2024 || this.yearGraduated == 2025) {
            return true;
        } else {
            return false;
        }
    }
}