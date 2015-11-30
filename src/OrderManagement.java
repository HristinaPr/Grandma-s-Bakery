import java.util.Scanner;

public class OrderManagement extends ManagementSystem{
	
	private int totalNumOfOrders = 0; 

	public int getTotalNumOfOrders() {
		return totalNumOfOrders;
	}
	public void setTotalNumOfOrders(int totalNumOfOrders) {
		this.totalNumOfOrders = totalNumOfOrders;
	}
	public  OrderManagement() {
		super();
		order = new Order();
	}

	private static Scanner scanner = new Scanner(System.in); 
	
	private Order order; 
	
	public void manage() {
		System.out.println("Select an item to add, remove or edit.");
		
		for (int i = 0; i < order.getProductAmount(); i++){ 
			Product product = order.products.get(i);
			System.out.println(i+1 + ". Name: " + product.getName() + ", price: " + product.getPrice());
		}
		
		String action = scanner.nextLine();  
		int productIndex = 0;
		if(action.contains(" ")){
			String[] splitActions = action.split(" "); 
			action = splitActions[0];
			String parameter = splitActions[1];
			//parameter is a number, convert it to type of int
			
			if (parameter.matches("-?\\d+(\\.\\d+)?")) { // to check if the option is an int 			
				
				productIndex = Integer.parseInt(parameter)-1; //the console read it as string so we need this conversion, in order to find the product at the given index
				
			} else {
				throw new IllegalArgumentException("Must enter number as parameter");
			}
		}
		switch(action) {
			case "add":
				addItem();
				manage();
			break;
			
			case "delete":
				removeItem(productIndex);
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
	 * 
	 * @param productIndex
	 */
		private void removeItem(int productIndex) {
			System.out.println("Enter an item to remove from the order: ");
			order.products.remove(productIndex);
			
			System.out.println("Enter number of items to remove from the order: ");
			int quantity = scanner.nextInt();
			
		}
		
		public void removeItemAmount(Product product) {
			System.out.println("Enter number of items to remove from the order: ");
			int quantity = scanner.nextInt();
			
			if(quantity > 0) {
				for(int i = 0; i < quantity; i++) {
					order.products.add(newProduct);
				
			}
				if(quantity < get.numOfOrderItems()) {
					for(int i = 0; i < qty; i++) {
						setOrderValue(value - product.getPrice());
						orderItems.remove(product);
						cupcakedatabase.addCupcake(product);
					}
				}
			}
		private void addItem(){
			
			System.out.println("Please enter a quantity");
			String quantityinput = scanner.nextLine();
			int quantity = Integer.parseInt(quantityinput);
			
			if(quantity > 0) {
				for(int i = 0; i < quantity; i++) {
					order.products.add(newProduct);
				}
			} else {
				throw new IllegalArgumentException("The amount has to be positive");
			}
		}
			/**
			 * @param product
			 * @throws IllegalArgumentException
			 */
			public void addItem(Product product) throws IllegalArgumentException {
				System.out.println("Enter number of items to add to the order: ");
				int qty = scanner.nextInt();
				
				if(qty > 0) {
					if(qty < product.getStockAmount()) {
						for(int i = 0; i < qty; i++) {
							setOrderValue(value + product.getPrice());
							orderItems.add(product);
							products.removeProduct(product);
						} order.products.add(newProduct);
				
					} else {
						throw new IllegalArgumentException("There is not enough in stock");
					}
				} else {
					throw new IllegalArgumentException("The amount has to be positive");
				}
			}	
	
	public void closeOrder(Employee employee) throws IllegalArgumentException {
		if(employee.getLoggedIn()) {
			employee.setRevenue(getOrderValue());
			employee.setNumOfSales(employee.getNumOfSales() + 1);
			orderdatabase.addOrder(this);
			orderItems.removeAll(orderItems);
		} else {
			throw new IllegalArgumentException("Employee is not logged in.");
		}
	}
	
	public void cancelOrder(Product products) {
		orderItems.removeAll(orderItems);
	}
}

	



