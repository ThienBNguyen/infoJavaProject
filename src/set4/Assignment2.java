//not complete
package set4;
class Order {
	private int orderidCounter;
	private int orderId;
	private String[] orderedFoods;
	private double totalPrice;
	private String status;
	
	
	
	public Order() {
		super();
	}
	public Order( String[] orderedFoods) {
		super();
		this.orderedFoods = orderedFoods;
		
	}
	
	public int getTotalNoIfIrders(int num) {
		return num;
	}
	
	public double calculateTotalPrice(String paymentMode) {
		double total = 1.0;
		return total;
	}
	public int getOrderidCounter() {
		return orderidCounter;
	}
	public void setOrderidCounter(int orderidCounter) {
		this.orderidCounter = orderidCounter;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
    //Implement your code here
}

public class Assignment2 {
	public static void main(String[] args) {
//		Order orderedFoods = new Order({"pizza", "chesse", "milk"});
        //Create more objects for testing your code                

	}

}
