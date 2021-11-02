import java.util.ArrayList;

public class UserList {
    /**
     * Variables for the UserList class
     */

    private static User user;
    private static UserList users;
    private ArrayList<User> userList;
    private ArrayList<Admin> adminList;
    private ArrayList<Student> studentList;
    private ArrayList<Employer> employerList;

    private UserList() {
        for(int i = 0; i < DataLoader.getStudents().size(); i++) {
            userList.add(DataLoader.getStudents().get(i));
        }
        for(int i = 0; i < DataLoader.getEmployers().size(); i++) {
            userList.add(DataLoader.getEmployers().get(i));
        }
        for(int i = 0; i < DataLoader.getAdmins().size(); i++) {
            userList.add(DataLoader.getAdmins().get(i));
        }
        // probably will actually load in admin, student, employer
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
    public User getUser(String userName, String password) {
        for(User user : userList) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    public boolean haveUser(String userName) {
		for(User user : userList) {
			if(user.getUserName().equals(userName)) {
				return true;
			}
		}

		return false;
	}

    // public boolean haveEmployer(String userName) {
	// 	for(Employer employer : employerList) {
	// 		if(employer.getUserName().equals(userName)) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
    
    public boolean addUser(String firstName, String lastName, String userName, String email) {
        if(haveUser(userName)) {
            return false;
        }
        
        //User newUser = new User;
        userList.add(user.User(firstName, lastName, userName, email));
        return true;
    }

    // public boolean addEmployerUser(String userName, String firstName, String lastName, String email) {
    //     if(haveEmployer(userName)) {
    //         return false;
    //     }
    //     employerList.add(new Employer(userName, firstName, lastName, email));
    //     return true;
    // }

    public void saveUsers() {
        DataWriter.saveStudent();
        DataWriter.saveEmployer();
        DataWriter.saveAdmin();
    }
    
}
