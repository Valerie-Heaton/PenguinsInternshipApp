import java.util.ArrayList;

public class UserList {
    /**
     * Variables for the UserList class
     */

    private static UserList users;
    private ArrayList<User> userList;
    private ArrayList<Admin> adminList;
    private ArrayList<Student> studentList;
    private ArrayList<Employer> employerList;

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
     */
    public User getUser(String userName, String password) {
        for(User user : userList) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    public Admin getAdmin(String userName, String password) {
        for(Admin admin : adminList) {
            if(admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {
                return admin;
            }
        }

        return null;
    }

    public Student getStudent(String userName, String password) {
        for(Student student : studentList) {
            if(student.getUserName().equals(userName) && student.getPassword().equals(password)) {
                return student;
            }
        }

        return null;
    }

    public Employer getEmployer(String userName, String password) {
        for(Employer employer : employerList) {
            if(employer.getUserName().equals(userName) && employer.getPassword().equals(password)) {
                return employer;
            }
        }

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

    public boolean haveAdmin(String userName) {
		for(Admin admin : adminList) {
			if(admin.getUserName().equals(userName)) {
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
    
    public boolean addAdmin(String firstName, String lastName, String userName, String password, String email) {
        if(haveAdmin(userName)) {
            return false;
        }
        
        adminList.add(new Admin(firstName, lastName, userName, password, email));
        return true;
    }

    public boolean addStudent(String firstName, String lastName, String userName, String password, String email) {
        if(haveStudent(userName)) {
            return false;
        }
        
        studentList.add(new Student(firstName, lastName, userName, password, email));
        return true;
    }

    public boolean addEmployer(String firstName, String lastName, String userName, String password, String email) {
        if(haveEmployer(userName)) {
            return false;
        }
        
        employerList.add(new Employer(firstName, lastName, userName, password, email));
        return true;
    }

    public void saveUsers() {
        DataWriter.saveStudents();
        DataWriter.saveEmployer();
        DataWriter.saveAdmin();
    }

    public ArrayList<Student> getStudents() {
        return this.studentList;
    }

    public ArrayList<Employer> getEmployers() {
        return this.employerList;
    }

    public ArrayList<Admin> getAdmins() {
        return this.adminList;
    }
    
}
