
/**
 * Represent the product entity in code as an object. It handles storing data for a specific product.
 * @author Hristina
 */
public class Product { 
	
	private String name;
	private String variant; // instead of type (it cover flavor)
	private double price; 
	private int stockAmount;

	/**
	 * Empty construct
	 */
	public Product() {
		
	}
	
  /**
   * Creates a new product. Sets the name, variant, price and stock amount.
   * @param name
   * @param variant
   * @param price
   * @param stockAmount
   */
	public void createProduct(String name, String variant, double price, int stockAmount) {
		this.setVariant(variant);
		this.setPrice(price);
		this.setName(name);
		this.setStockAmount(stockAmount);
	}

	/**
	 * access the name attribute
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set the name attribute
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** 
	 * @return the product price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/** 
	 * @return the type
	 */
	public String getVariant() {
		return variant;
	}
	
	/**
	 * @param variant
	 */
	public void setVariant(String variant) {
		this.variant = variant;
	}

	/**
	 * @return the stockAmount
	 */
	public int getStockAmount() {
		return stockAmount;
	}

	/**
	 * @param stockAmount the stockAmount to set
	 */
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
} 
