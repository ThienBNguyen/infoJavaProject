package set2;
class OrderFood{
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
//	public Order() {
//		
//	}
	public OrderFood(int orderId, String orderedFoods) {
		System.out.println("constructor run");
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
	}
}
public class Assignment7 {
	public static void main(String [] args) {
		OrderFood order1 = new OrderFood(1001, "Pizza");
		System.out.println(order1.orderId);
	}
}
