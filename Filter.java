/**
 * The Filter class that will work with the Search class.
 * This gives the user options to Filter and narrow their search.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */


 public class Filter { 
     // will 'extends Search' later, when the Search class is made

     //Filters will throw an error until we can connect it to a list (enumeration)
     //Will need a private helper class for each one, (3).

    /**
    * These are the private variables for the Filter class.
    */
     private EmployerFilters employerFilters; 
     private StudentFilters studentFilters;
     private InternshipFilters internshipFilters;

    /**
     * This is the constructor for the Filter class 
     * @param employerFilters is an Employer Filter object.
     * @param studentFilters is a Student Filters object.
     * @param internshipFilters is an Internship Filter object.
     */
     public Filter(EmployerFilters employerFilters, StudentFilters studentFilters, InternshipFilters internshipFilters) {
        this.employerFilters = employerFilters;
        this.studentFilters = studentFilters;
        this.internshipFilters = internshipFilters;
     }
    
      /**
      * This gets the employerFilters method from the children classes
      * @return returns the selected employer filters
      */   
     public EmployerFilters getEmployerFilters() {
         return this.employerFilters;
     } 
      /**
      * This gets the studenFilters method from the children classes
      * @return returns the selected student filters
      */   
     public StudentFilters getStudentFilters() {
         return this.studentFilters;
     }
      /**
      * This gets the internshipFilters method from the children classes
      * @return returns the selected internship filters
      */   
     public InternshipFilters getInternshipFilters() {
         return this.internshipFilters;
     }

     /**
      * Sets the employer filters, showing the user a list, printing out the employer enumerations.
      */
     public void setEmployerFilters() {
        for (EmployerFilters employerFilter : EmployerFilters.values()) {
            employerFilter = employerFilters;
            System.out.println(employerFilter);
        }
     }

    /**
    * Sets the student filters, showing the user a list, printing out the student enumerations.
    */
     public void setStudentFilters(StudentFilters studentFilters) {
         for (StudentFilters studentFilter : StudentFilters.values()) {
             studentFilter = studentFilters;
             System.out.println(studentFilter);
         }
     }

    /**
    * Sets the internship filters, showing the user a list, printing out the internship enumerations.
    */
     public void setInternshipFilters(InternshipFilters internshipFilters) {
         for (InternshipFilters internshipFilter : InternshipFilters.values()) {
             internshipFilter = internshipFilters;
             System.out.println(internshipFilter);
         }
     }
 }