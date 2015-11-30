import java.util.Date;
import java.util.UUID;

/**
 * This class is responsible for managing the data for the transaction as well as handling the order.
 * @author Hristina
 */
public class Transaction {
	
	private String ID; 
	private Order order; 
	public Date date; 
	private Employee employee;

	
	/**
	 * Constructor, where we produce a random id and sets the date to a new date, 
	 * set the employee to be the currently logged in employee
	 * @param loggedInEmployee 
	 */
	public Transaction(Employee loggedInEmployee){ 
		this.setID(UUID.randomUUID().toString()); 
		this.date = new Date();
		employee = loggedInEmployee;
	}
	
	/**
	 * Create new transaction and sets ID, order, date, employee
	 * @param ID
	 * @param order
	 * @param date
	 * @param employee
	 */
	public void createTransaction(String ID, Order order, Date date, Employee employee){
		this.setID(ID);
		this.setOrder(order);
		this.setDate(date);
		this.setEmployee(employee);
	}
	
	/**
	 * This method closes the order and sets total revenue to an employee,
	 * taking the orders and their value. Then sets the total number of orders incremented by 1.
	 * Every new order made by this employee will be added to the total number of orders.
	 * @param employee
	 * @throws IllegalArgumentException
	 */
	public void closeOrder(Employee employee) {
		
			employee.setTotalRevenue(employee.getTotalRevenue() + order.getValue());
			employee.setTotalNumOfOrders(employee.getTotalNumOfOrders() + 1);
			//orderdatabase.addOrder(this);
			//order.products.removeAll(order.products);
	}
	
	/**
	 * This method cancels an order by clearing the products in the order.
	 */
	public void cancelOrder() {
		order.products.clear();
	}
	/**
	 * Access the date
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * set date
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
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
