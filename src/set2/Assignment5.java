package set2;
class Order{

    public int orderId;
    public String orderedFoods;
    public double totalPrice;
    public String status;
    public void calculateTotalPrice(int unitPrice) {
        double services = unitPrice * .05;
        totalPrice = services + unitPrice;
        System.out.println("Order Details");
        System.out.println("Order Id : " + orderId);
        System.out.println("Ordered Food : " + orderedFoods);
        System.out.println("Order Status : " + status);
        System.out.println("Total Price : " + totalPrice);

    }
}
public class Assignment5 {
	 public static void main(String [] args){
	        // Object creation
	        Order order = new Order();
	        order.orderId = 101;
	        order.orderedFoods = "Pizza";
	        order.status = "Ordered";
	        order.calculateTotalPrice(100);

	    }
}
