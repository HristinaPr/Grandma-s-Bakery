import java.util.Scanner;

/**
 * This is the main program class (test)
 * @author Hristina
 *
 */
public class GrandmaBakery {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Employee loggedInEmployee; // store the employee
	private static Authentication auth;
	public static void main(String[] args) {	
		
		System.out.println("Welcome to Grandma's Bakery system!");

		if (loggedInEmployee == null){ 
			
			auth = new Authentication();
			auth.login(); //call the log in method in the auth class
			loggedInEmployee = auth.getEmployee(); 
		}
		
		
		while (true) { 
			System.out.println("Select an option:");
			System.out.println("1. Employees");
			System.out.println("2. Order History");
			System.out.println("3. New transaction\n");
			
			int option = scanner.nextInt();
			
			switch (option){ 
				case 1: System.out.println("Employee screen");
				
					break;
				
				case 2: System.out.println("Order history");
					break;
				
				case 3: System.out.println("New transaction");
					Transaction trns = new Transaction(loggedInEmployee); 
					OrderManagement ordmgr = new OrderManagement(); 
					ordmgr.manage();
					
					break;
					
				case 4: System.out.println("Management system");
					
					
				default:
					System.out.println("Unknown selection.\n");
			}

			System.out.println("End of execution. Press enter to restart\n");
			
			scanner.nextLine(); // ask for confirmation to re-run program
		}		
	}
}
