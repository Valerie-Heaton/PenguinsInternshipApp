import java.util.ArrayList;

public class InternshipList {
    
    /**
     * Variables for the InternshipList class
     */
    private static InternshipList internships;
    private ArrayList<Internships> internshipList;
    
    /**
     * The private method for the InternshipList class
     */
    private InternshipList() {
        internshipList = DataLoader.getInternships();
    }
    
    /**
     * The public getInstance method fetches the instance of 'Internship'
     */
    public static InternshipList getInstance() {
        if(internships == null) {
            internships = new InternshipList();
        }

        return internships;
    }

    public ArrayList<Internships> getInternships() {
        return this.internshipList;
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
