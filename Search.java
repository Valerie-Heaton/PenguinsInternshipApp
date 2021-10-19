import java.util.*;

/**
 * This is the Search class we will use to search for internships, students, and employers.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
public class Search {

    /**
     * These are all instance variables used to initialize the ArrayLists of the students, employers, and internships.
     */
    private ArrayList<Student> listOfStudents;
    private ArrayList<Employer> listOfEmployers;
    private ArrayList<Internships> listOfInternships;
    private Filter filter;

    /**
     * This is the constructor for the Search class.
     * @param listOfStudents is the list of students
     * @param listOfEmployers is the list of employers
     * @param listOfInternships is the list of internships
     */
    public Search(ArrayList<Student> listOfStudents, ArrayList<Employer> listOfEmployers, ArrayList<Internships> listOfInternships) {
        this.listOfEmployers = listOfEmployers;
        this.listOfInternships = listOfInternships;
        this.listOfStudents = listOfStudents;
    }

    /**
     * This method is the accessor for the list of students.
     * @return the list of students
     */
    public ArrayList<Student> getListOfStudents() {
        return this.listOfStudents;
    }

    /**
     * This method is the accessor for the list of employers.
     * @return the list of employers
     */
    public ArrayList<Employer> getListOfEmployers() {
        return this.listOfEmployers;
    }

    /**
     * This method is the accessor for the list of internships.
     * @return the list of internships
     */
    public ArrayList<Internships> getListOfInternships() {
        return this.listOfInternships;
    }
    
    /**
     * This method is the accessor of the filter and returns it in the form of the object Filter.
     * @return the filters
     */
    public Filter getFilter() {
        return this.filter;
    }
}
