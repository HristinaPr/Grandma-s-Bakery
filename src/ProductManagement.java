import java.util.ArrayList;
import java.util.Scanner;


/**
 * This class is responsible for managing the products, this includes adding, deleting and editing product.
 * @author Hristina
 *
 */
public class ProductManagement extends ManagementSystem{

	/**
	 * constructor that calls the ManagementSystem constructor
	 */
	public ProductManagement() {
		super();
	}
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * This is a function that shows a list with the products. The second part is for the console,
	 * so it will be removed when we have the GUI's
	 */
	public void manage(){
	
		System.out.println("Select a product to edit, or type 'add' to create a new product.");
		for (int i = 0; i < products.size(); i++){ 
				Product product = products.get(i); 
				System.out.println(i+1 + ". Name: " + product.getName() + 
						"\nPrice: " + product.getPrice()+ 
						"\nVariant: " + product.getVariant() + 
						"\nPrice: " + product.getStockAmount());
		}
		String action = scanner.nextLine(); 
		int productIndex = 0;
		if(action.contains(" ")){
			String[] splitActions = action.split(" "); 
			action = splitActions[0];
			String parameter = splitActions[1];
			
			
			if (parameter.matches("-?\\d+(\\.\\d+)?")) {  			
				
				productIndex = Integer.parseInt(parameter)-1; 
				
			} else {
				throw new IllegalArgumentException("Must enter number as parameter");
			}
		}
			   
		switch(action) {
			case "add":
				addProduct();
				manage();
			break;
			
			case "delete":
				deleteProduct(productIndex); 
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
	
	/**
	 * Method for add a new product.
	 */
	private void addProduct() {
		System.out.println("Enter name:");
		String name = scanner.nextLine();

		System.out.println("Enter variant:");
		String variant = scanner.nextLine();
		
		System.out.println("Enter price:");
		double price = scanner.nextDouble();
		
		System.out.println("Enter stock amount:");
		int stockAmount = scanner.nextInt();
		
		Product newProduct = new Product();
		newProduct.setName(name);
		newProduct.setVariant(variant);
		newProduct.setPrice(price);
		newProduct.setStockAmount(stockAmount);
		
		products.add(newProduct);
	}
	
	/**
	 * removes the entire product (eg. Banana cupcake)
	 * @param index
	 */
	private void deleteProduct(int index) { 
		this.removeProductViaIndex(index);	
	}
	
	/**
	 * Edit product data
	 * @param indexOfProductToEdit
	 */
	private void editProduct(int indexOfProductToEdit) {
		System.out.println("Edit name:");
		String name = scanner.nextLine();

		System.out.println("Edit variant:");
		String variant = scanner.nextLine();
		
		System.out.println("Edit price:");
		double price = scanner.nextDouble();
		
		System.out.println("Edit stock amount:");
		int stockAmount = scanner.nextInt();
		
		
		Product targetproduct = products.get(indexOfProductToEdit);
		targetproduct.setName(name);
		targetproduct.setVariant(variant);
		targetproduct.setPrice(price);
		targetproduct.setStockAmount(stockAmount);
		
		//TODO: save the edited product
	}
}
