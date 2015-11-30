import java.util.Scanner;

/** 
 * This class is responsible for the registration and login of the users in the application
 * @author Hristina
 */
public class Authentication { 
	
	private static Scanner scanner = new Scanner(System.in); 
	private Employee employee;
	private boolean loggedIn;
	
	/**
	 * Method for creating username and password.
	 * Username is converted to all lowercase, so no mistype will prevent login.
	 * Password is entered twice, and if the two match - the password will be set.
	 */
	protected void credentials() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter new username: ");
		employee.setUsername(scan.nextLine().toLowerCase());
		
		System.out.println("Enter new password: ");
		String pass1 = scan.nextLine();
		System.out.println("Repeat password: ");
		String pass2 = scan.nextLine();
		
		if(pass1 == pass2) {
			employee.setPassword(pass1);
		} else {
			System.out.println("Passwords do not match.");
		}
	}
	
	/**
	 * Allows the employees to login.
	 * Asks for username and password - and logs the user in, if they match the password and username
	 * given when employee was created.
	 */
	public void login() {
		Scanner input = new Scanner(System.in);
		String usernameInput;
		String passwordInput;
		
		System.out.println("Enter username: ");
		usernameInput = input.nextLine();
		System.out.println("Enter password: ");
		passwordInput = input.nextLine();

		if(usernameInput.equals(employee.getUsername()) && passwordInput == employee.getPassword()) {
			System.out.println("Succesfully logged in.");
			loggedIn = true;
		} else {
			System.out.println("Username or password incorrect");
			loggedIn = false;
		}
	}
	
	/**
	 * Logs out user by setting boolean loggedIn to false.
	 */
	public void logout() {
		loggedIn = false;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() { 
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
