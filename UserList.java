/**
* This is the UserList class we will use to implement the User program.
* 
* @author Siri, Maddie, Valerie, Ali
*/
import java.util.ArrayList;

public class UserList {
    /**
     * Private variables for the UserList class
     */
    private static UserList users;
    private ArrayList<User> userList;
    private ArrayList<Admin> adminList;
    private ArrayList<Student> studentList;
    private ArrayList<Employer> employerList;

    /**
     * This is the UserList class constructor.
     */
    public UserList() {
        adminList = DataLoader.getAdmins();
        studentList = DataLoader.getStudents();
        employerList = DataLoader.getEmployers();
        
    }

    /**
     * The public getInstance method fetches the instance of 'User'
     */
    public static UserList getInstance() {
        if (users == null) {
            users = new UserList();
        }
        return users;
    }

    /**
     * The public array list method containing the instance of 'User' fetches the user's profile
     * @param userName is the appropriate String and coincides with the user's username.
     * @param password is the appropriate String and coincides with the user's password.
     */
    public User getUser(String userName, String password) {
        for(User user : userList) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    /**
     * The public array list method containing the instance of 'Admin' fetches the admin's profile
     * @param userName is the appropriate String and coincides with the admin's username.
     * @param password is the appropriate String and coincides with the admin's password.
     */
    public Admin getAdmin(String userName, String password) {
        for(Admin admin : adminList) {
            if(admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {
                return admin;
            }
        }

        return null;
    }

    /**
     * The public array list method containing the instance of 'Student' fetches the student's profile
     * @param userName is the appropriate String and coincides with the student's username.
     * @param password is the appropriate String and coincides with the student's password.
     */
    public Student getStudent(String userName, String password) {
        for(Student student : studentList) {
            if(student.getUserName().equals(userName) && student.getPassword().equals(password)) {
                return student;
            }
        }

        return null;
    }

    /**
     * The public array list method containing the instance of 'Employer' fetches the employer's profile
     * @param userName is the appropriate String and coincides with the employer's username.
     * @param password is the appropriate String and coincides with the employer's password.
     */    
    public Employer getEmployer(String userName, String password) {
        for(Employer employer : employerList) {
            if(employer.getUserName().equals(userName) && employer.getPassword().equals(password)) {
                return employer;
            }
        }

        return null;
    }

    /**
     * The following boolean runs to see if the following student user is in the user list.
     * @param userName is the appropriate String and processes if the user name is valid.
     * @return returns true if the user name that is fetched equals the one inputted.
     */
    public boolean haveStudent(String userName) {
		for(Student student : studentList) {
			if(student.getUserName().equals(userName)) {
				return true;
			}
		}

		return false;
	}

    /**
     * The following boolean runs to see if the following admin user is in the user list.
     * @param userName is the appropriate String and processes if the user name is valid.
     * @return returns true if the user name that is fetched equals the one inputted.
     */    
    public boolean haveAdmin(String userName) {
		for(Admin admin : adminList) {
			if(admin.getUserName().equals(userName)) {
				return true;
			}
		}

		return false;
	}

    /**
     * The following boolean runs to see if the following employer user is in the user list.
     * @param userName is the appropriate String and processes if the user name is valid.
     * @return returns true if the user name that is fetched equals the one inputted.
     */        
    public boolean haveEmployer(String userName) {
		for(Employer employer : employerList) {
			if(employer.getUserName().equals(userName)) {
				return true;
			}
		}

		return false;
	}

    /**
     * The following boolean runs to add an admin user into the system.
     * @param firstName is the appropriate String and processes the given first name.
     * @param lastName is the appropriate String and processes the given last name.
     * @param userName is the appropriate String and processes the given user name.
     * @param password is the appropriate String and processes the given password.
     * @param email is the appropriate String and processes the given email.
     * @return returns false if the admin name is not in the system, and true if the following
     * components are necessary to add into the user list system.
     */      
    public boolean addAdmin(String firstName, String lastName, String userName, String password, String email) {
        if(haveAdmin(userName)) {
            return false;
        }
        
        adminList.add(new Admin(firstName, lastName, userName, password, email));
        return true;
    }

    /**
     * The following boolean runs to add a student user into the system.
     * @param firstName is the appropriate String and processes the given first name.
     * @param lastName is the appropriate String and processes the given last name.
     * @param userName is the appropriate String and processes the given user name.
     * @param password is the appropriate String and processes the given password.
     * @param email is the appropriate String and processes the given email.
     * @return returns false if the student name is not in the system, and true if the following
     * components are necessary to add into the user list system.
     */          
    public boolean addStudent(String firstName, String lastName, String userName, String password, String email) {
        if(haveStudent(userName)) {
            return false;
        }
        
        studentList.add(new Student(firstName, lastName, userName, password, email));
        return true;
    }

    /**
     * The following boolean runs to add an employer user into the system.
     * @param firstName is the appropriate String and processes the given first name.
     * @param lastName is the appropriate String and processes the given last name.
     * @param userName is the appropriate String and processes the given user name.
     * @param password is the appropriate String and processes the given password.
     * @param email is the appropriate String and processes the given email.
     * @return returns false if the employer name is not in the system, and true if the following
     * components are necessary to add into the user list system.
     */         
    public boolean addEmployer(String firstName, String lastName, String userName, String password, String email) {
        if(haveEmployer(userName)) {
            return false;
        }
        
        employerList.add(new Employer(firstName, lastName, userName, password, email));
        return true;
    }

    /**
     * The following method saves the users to the user list based on their respective type,
     * albeit student, employer or admin.
     */
    public void saveUsers() {
        DataWriter.saveStudents();
        DataWriter.saveEmployer();
        DataWriter.saveAdmin();
    }

    /**
     * Gets the student user.
     * @return returns the (student) user variable.
     */    
    public ArrayList<Student> getStudents() {
        return this.studentList;
    }

    /**
     * Gets the employer user.
     * @return returns the (employer) user variable.
     */        
    public ArrayList<Employer> getEmployers() {
        return this.employerList;
    }

    /**
     * Gets the admin user.
     * @return returns the (admin) user variable.
     */            
    public ArrayList<Admin> getAdmins() {
        return this.adminList;
    }
    
}
