
/**
 * Represent the employee entity in code as an object. It handles storing data for a specific employee.
 * @author Hristina
 *
 */
public class Employee {
	
	private String name; 
	private String address; 
	private String phone;
	private String ID; // either id or user name
	protected String username; 
	protected String password; 
	private double totalRevenue;
	private int totalNumOfOrders;
		
	/**
	 * empty constructor
	 */
	public Employee(){
	}
	
	/**
	 * Creates a new employee. Sets the name, address, phone, ID, user name, password, totalRevenue, totalNumOfOrders.
	 * @param name
	 * @param address
	 * @param phone
	 * @param ID
	 * @param username
	 * @param password
	 * @param totalRevenue
	 * @param totalNumOfOrders
	 */
	public void createEmployee(String name, String address, String phone, String ID, String username, String password, double totalRevenue, int totalNumOfOrders) {
		this.setName(name);
		this.setAddress(address);
		this.setPhone(phone);
		this.setID(ID);
		this.setUsername(username);
		this.setPassword(password);
		this.setTotalRevenue(totalRevenue);
		this.setTotalNumOfOrders(totalNumOfOrders);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) { 
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the totalRevenue
	 */
	public double getTotalRevenue() {
		return totalRevenue;
	}

	/**
	 * @param totalRevenue the totalRevenue to set
	 */
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	/**
	 * @return the totalNumOfOrders
	 */
	public int getTotalNumOfOrders() {
		return totalNumOfOrders;
	}

	/**
	 * @param totalNumOfOrders the totalNumOfOrders to set
	 */
	public void setTotalNumOfOrders(int totalNumOfOrders) {
		this.totalNumOfOrders = totalNumOfOrders;
	}
}
