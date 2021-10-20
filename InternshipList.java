import java.util.ArrayList;

public class InternshipList {
    /**
     * Variables for the InternshipList class
     */
    private InternshipList internshipList;
    private ArrayList<Internship> internships;

    public String job;
    /**
     * The private method for the InternshipList class
     */
    private InternshipList() {}
    /**
     * The public getInstance method fetches the instance of 'Internship'
     */
    public Internship getInstance() {}
    /**
     * The public array list method containing the 'internship' instance that fetches internship entries
     * named 'jobs.'
     */
    public ArrayList<Internship> getInternships(String job) {
        this.job = job;
    }
    
}
