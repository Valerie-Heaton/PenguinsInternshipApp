import java.util.ArrayList;

public class InternshipList {
    /**
     * Variables for the InternshipList class
     */
    private InternshipList internshipList;
    private ArrayList<Internships> internships;

    public String job;
    /**
     * The private method for the InternshipList class
     */
    private InternshipList() {}
    /**
     * The public getInstance method fetches the instance of 'Internship'
     */
    public Internships getInstance() {
        return null;
    }

    public ArrayList<Internships> getInternships() {
        return internships;
    }
    /**
     * The public array list method containing the 'internship' instance that fetches internship entries
     * named 'jobs.'
     */
    public ArrayList<Internships> getInternships(String job) {
        ArrayList<Internships> foundInternships = new ArrayList<>();
        for (int i = 0; i < internships.size(); i++) {
            if (internships.get(i).contains(job)) {
                foundInternships.add(internships.get(i));
            }
        }
        return foundInternships;
    }
    
}
