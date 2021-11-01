import java.util.ArrayList;

public class UserList {
    /**
     * Variables for the UserList class
     */
    private static UserList users;
    private ArrayList<Student> studentList;
    private ArrayList<Employer> employerList;

    private UserList() {
        studentList = DataLoader.getStudents();
        employerList = DataLoader.getEmployers();
    }
    /**
     * The public getInstance method fetches the instance of 'User'
     */
    public UserList getInstance() {
        if (users == null) {
            users = new UserList();
        }
        return users;
    }
    /**
     * The public array list method containing the instance of 'User' fetches the user's profile
     */
    public ArrayList<User> getUser(String userString) {
        return null;
    }

    public boolean haveStudent(String userName) {
		for(Student student : studentList) {
			if(student.getUserName().equals(userName)) {
				return true;
			}
		}
		return false;
	}

    public boolean haveEmployer(String userName) {
		for(Employer employer : employerList) {
			if(employer.getUserName().equals(userName)) {
				return true;
			}
		}
		return false;
	}
    
    public boolean addStudentUser(String userName, String firstName, String lastName, String email, String major) {
        if(haveStudent(userName)) {
            return false;
        }

        studentList.add(new Student(userName, firstName, lastName, email, major));
        return true;

    }

    public boolean addEmployerUser(String userName, String firstName, String lastName, String email) {
        if(haveEmployer(userName)) {
            return false;
        }

        employerList.add(new Employer(userName, firstName, lastName, email));
        return true;

    }

    public void saveUsers() {
        DataWriter.saveStudent();
        DataWriter.saveEmployer();
    }
    
}
