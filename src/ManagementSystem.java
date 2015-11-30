import java.util.ArrayList;

/**
 * This is a super class, which is responsible for holding the data for the different databases 
 * @author Hristina
 */
public abstract class ManagementSystem {
	
	protected static ArrayList<Product> products;
	protected static ArrayList<Employee> employees;
	protected static ArrayList<Order> orders;
	
	/**
	 * Constructor, here we initialise the ArrayLists 
	 */
	public ManagementSystem() {
		
		products = new ArrayList<Product>();
		employees = new ArrayList<Employee>();
		orders = new ArrayList<Order>();
	}
	
	/**
	 * Adds an product to the DB
	 * @param product
	 */
	protected void addProductToDB(Product product) { //for variant
		products.add(product);
	}
	
	/**
	 * Add an Employee to the DB
	 * @param employee
	 */
	protected void addEmployeeToDB(Employee employee) {
		employees.add(employee);
	}
	
	/**
	 * Add an Order to the DB
	 * @param order
	 */
	protected void addOrderToDB(Order order) { 
		orders.add(order);
	}
	
	/**
	 * Removes this product from the DB
	 */
	public void removeProductViaIndex(int index){
		products.remove(index);
	}
	
	/**
	 * Removes the employee from the DB
	 * @param index
	 */
	public void removeEmployeeViaIndex(int index){
		employees.remove(index);
	}
	
	/**
	 * Removes the order from the DB
	 * @param index
	 */
	public void removeOrderViaIndex(int index){
		orders.remove(index);
	}
	
	/**
	 * This method removes a product by having it passed to it and then grabbing its index
	 * @param product
	 */
	public void removeProductViaObject(Product product) {
		int index = products.indexOf(product); 
		this.removeProductViaIndex(index);
	}
	
	/**
	 * This method removes an employee by having it passed to it and then grabbing its index
	 * @param employee
	 */
	public void removeEmployeeViaObject(Employee employee) {
		int index = employees.indexOf(employee); 
		this.removeEmployeeViaIndex(index);
	}
	
	/**
	 * This method removes an order by having it passed to it and then grabbing its index
	 * @param order
	 */
	public void removeOrderViaObject(Order order) {
		int index = orders.indexOf(order); 
		this.removeOrderViaIndex(index);
	}
}