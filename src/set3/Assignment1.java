package set3;

class OrderSet3{
	private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;
    public void calculateTotalPrice(int unitPrice) {//public method keep public
        double services = unitPrice * .05;
        totalPrice = services + unitPrice;
        System.out.println("Order Details");
        System.out.println("Order Id : " + orderId);
        System.out.println("Ordered Food : " + orderedFoods);
        System.out.println("Order Status : " + status);
        System.out.println("Total Price : " + totalPrice);

    }
    public int getOrderId() {
 		return orderId;
 	}
 	public void setOrderId(int orderId) {
 		this.orderId = orderId;
 	}
 	public String getOrderedFoods() {
 		return orderedFoods;
 	}
 	public void setOrderedFoods(String orderedFoods) {
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
    
}

class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	
	public Customer(String customerId, String customerName, long contactNumber, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class Assignment1 {
public static void main(String [] args) {
	OrderSet3 order = new OrderSet3();
	order.setOrderedFoods("pizza");
	order.setOrderId(101);
	order.setStatus("ready");
	order.setTotalPrice(30);
	System.out.println(order.getOrderedFoods());
	order.calculateTotalPrice(30);
	Customer customer = new Customer("12345", "THien", 123456789, "123 howard ln austin tx");
	customer.displayCustomerDetails();
}
}
