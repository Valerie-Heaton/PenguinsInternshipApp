/**
 * The Filter class works with the Search class.
 * It gives the user options to Filter their search.
 */


 public class Filter { 
     // will 'extends Search' later, when the Search class is made

     //Filters will throw an error until we can connect it to a list (enumeration)
     //Will need a private helper class for each one, (3).

     private EmployerFilters employerFilters; 
     private StudentFilters studentFilters;
     private InternshipFilters internshipFilters;

     public Filter(EmployerFilters employerFilters, StudentFilters studentFilters, InternshipFilters internshipFilters) {
        this.employerFilters = employerFilters;
        this.studentFilters = studentFilters;
        this.internshipFilters = internshipFilters;
     }
    
     //get Student, Employer, and Internship filters

     public EmployerFilters getEmployerFilters() {
         return this.employerFilters;
     } 

     public StudentFilters getStudentFilters() {
         return this.studentFilters;
     }

     public InternshipFilters getInternshipFilters() {
         return this.internshipFilters;
     }

     //set Student, Employer, and Internship filters (shows the user a list).
     //Each loop prints out the respective enums

     public void setEmployerFilters() {
        for (EmployerFilters employerFilter : EmployerFilters.values()) {
            employerFilter = employerFilters;
            System.out.println(employerFilter);
        }
     }

     public void setStudentFilters(StudentFilters studentFilters) {
         for (StudentFilters studentFilter : StudentFilters.values()) {
             studentFilter = studentFilters;
             System.out.println(studentFilter);
         }
     }

     public void setInternshipFilters(InternshipFilters internshipFilters) {
         for (InternshipFilters internshipFilter : InternshipFilters.values()) {
             internshipFilter = internshipFilters;
             System.out.println(internshipFilter);
         }
     }
 }