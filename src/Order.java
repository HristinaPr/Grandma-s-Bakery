import java.util.ArrayList;

/**
 * Represent the order entity in code as an object. It handles storing data for a specific order.
 * @author Hristina
 *
 */
public class Order {
	
	public ArrayList<Product> products;
	protected double value;

	/**
	 * The constructor where we initialise a local ArrayList of products, 
	 * which will be in the order.
	 */
	public Order(){
		 products = new ArrayList<Product>();
	}
	
	/**
	 * This method returns the size of the order, which is local to this specific class.
	 * @return the total amount of products in the order
	 */
	public int getProductAmount() {
		return this.products.size(); 
	} 
	
	
	/**
	 * Access the array list with products
	 * @return
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}

	/**
	 * Sets the products in the ArrayList
	 * @param products
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	/**
	 * @return value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
