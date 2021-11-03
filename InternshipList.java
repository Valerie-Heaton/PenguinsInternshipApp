/**
 * The InternshipList class that will work with the internship program.
 * This provides the user with a list of available internships.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;

public class InternshipList {
    
    /**
     * Private variables for the InternshipList class
     */
    private static InternshipList internships;
    private ArrayList<Internships> internshipList;
    
    /**
     * The constructor method for the InternshipList class
     */
    private InternshipList() {
        internshipList = DataLoader.getInternships();
    }
    
    /**
     * This calls the instance method from the children classes.
     * @return returns the internship entries back to the user.
     */
    public static InternshipList getInstance() {
        if(internships == null) {
            internships = new InternshipList();
        }

        return internships;
    }

    /**
     * This calls the internship method from the children classes.
     * @return returns the internship list entries back to the user.
     */    
    public ArrayList<Internships> getInternships() {
        return this.internshipList;
    }

    /**
     * The public array list method containing the 'internship' instance that fetches internship entries
     * named 'jobs.'
     */
    public ArrayList<Internships> getInternships(String job) {
        ArrayList<Internships> foundInternships = new ArrayList<>();
        for (int i = 0; i < internshipList.size(); i++) {
            if (internshipList.get(i).contains(job)) {
                foundInternships.add(internshipList.get(i));
            }
        }
        return foundInternships;
    }
    
}
