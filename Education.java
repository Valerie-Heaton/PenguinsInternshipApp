import javax.net.ssl.TrustManager;

//needs json?

public class Education {

    private String schoolEducationReceived;
    private int yearGraduated;
    private String major;

    public Education(String schoolEducationReserved, String major, int yearGraduated) {
        this.schoolEducationReceived = schoolEducationReceived;
        this.yearGraduated = yearGraduated;
        this.major = major;
    }

    public String getSchoolEducationReceived() {
        return this.schoolEducationReceived;
    }

    public int getYearGraduated() {
        return this.yearGraduated;
    }

    public String getMajor() {
        return this.major;
    }

    public boolean checkSchoolEducationReceived() {
        if (this.schoolEducationReceived.equalsIgnoreCase("UofSC") || this.schoolEducationReceived.equalsIgnoreCase("The University of South Carolina") || this.schoolEducationReceived.equalsIgnoreCase("University of South Carolina") || this.schoolEducationReceived.equalsIgnoreCase("USC")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkYearGraduated() {
        if (this.yearGraduated == 2022 || this.yearGraduated == 2023 || this.yearGraduated == 2024 || this.yearGraduated == 2025) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMajor() {
        if (this.yearGraduated == 2022 || this.yearGraduated == 2023 || this.yearGraduated == 2024 || this.yearGraduated == 2025) {
            return true;
        } else {
            return false;
        }
    }
}
