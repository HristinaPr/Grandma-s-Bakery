import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible for managing the employees, this includes creating, deleting and editing employees.
 * @author Hristina
 *
 */
public class EmployeeManagement extends ManagementSystem {
	
	/**
	 * constructor that calls the ManagementSystem constructor
	 */
	public EmployeeManagement() {
		super();		
	}
		
	private static Scanner scanner = new Scanner(System.in); 	
	
	/**
	 * This is a function that shows a list with the employees. The second part is for the console,
	 * so it will be removed when we have the GUI's
	 */
	public void manage(){
		
		System.out.println("Select an employee to edit, or type 'add' to create a new employee.");
		for (int i = 0; i < employees.size(); i++){ 
					Employee employee = employees.get(i); 
					System.out.println(i+1 + ". Name: " + employee.getName() + ", ID: " + employee.getID());
				}
		String action = scanner.nextLine();
		int employeeIndex = 0;
		if(action.contains(" ")){
			String[] splitActions = action.split(" "); 
			action = splitActions[0];
			String parameter = splitActions[1];
			
			
			if (parameter.matches("-?\\d+(\\.\\d+)?")) { 		
				
				employeeIndex = Integer.parseInt(parameter)-1; //the console reads it as string so we need this conversion, in order to find the employee at the given index
				
			} else {
				throw new IllegalArgumentException("Must enter number as parameter");
			}
		
			switch(action) {
				case "add":
					createEmployee();
					manage();
				break;
				
				case "delete":
					deleteEmployee(employeeIndex); 
					manage();
				break;
				
				case "edit":
					System.out.println("Edit");
				break;
				
				case "view":
					System.out.println("View");
				break;
				
				case "exit":
					
				break;
				
				default: 	
					System.out.println("Unknown input");
				break;
			}		
		}
	}
	
	/**
	 * Method for creating new employee.
	 */
	private void createEmployee() {
		System.out.println("Enter Name:");
		String name = scanner.nextLine();

		System.out.println("Enter Address:");
		String address = scanner.nextLine();
		
		System.out.println("Enter Telephone:");
		String phone = scanner.nextLine();
		
		System.out.println("Enter ID:");
		String ID = scanner.nextLine();
		
		System.out.println("Enter Username:");
		String username = scanner.nextLine();
		
		System.out.println("Enter Password:");
		String password = scanner.nextLine();
		
		Employee newEmployee = new Employee();
		newEmployee.setName(name);
		newEmployee.setAddress(address);
		newEmployee.setPhone(phone);
		newEmployee.setID(ID);
		newEmployee.setUsername(username);
		newEmployee.setPassword(password);
		
		employees.add(newEmployee);
	}
	
	/**
	 * Use an employee Index to delete an employee 
	 * @param employeeIndex
	 */
	private void deleteEmployee(int employeeIndex) {
		employees.remove(employeeIndex);
	}
	
	/**
	 * Edit employee data
	 * @param indexOfEmployeeToEdit
	 */
	private void editEmployee(int indexOfEmployeeToEdit) {
		System.out.println("Edit name:");
		String name = scanner.nextLine();

		System.out.println("Edit address:");
		String address = scanner.nextLine();
		
		System.out.println("Edit telephone:");
		String telephone = scanner.nextLine();
		
		System.out.println("Edit ID:");
		String ID = scanner.nextLine();
		
		System.out.println("Edit username:");
		String username = scanner.nextLine();
		
		System.out.println("Edit password:");
		String password = scanner.nextLine();
		
		Employee targetemployee = employees.get(indexOfEmployeeToEdit);
		targetemployee.setName(name);
		targetemployee.setAddress(address);
		targetemployee.setPhone(telephone);
		targetemployee.setID(ID);
		targetemployee.setUsername(username);
		targetemployee.setPassword(password);

		//TODO: save the edited employee
	}	
}

