package set2;
class Restaurant2 {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	public Restaurant2(String name, int restaurantContact, String restaurantAddress, int rating) {
		// TODO Auto-generated constructor stub
		this.restaurantName = name;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}

}
public class Assignment8 {
	public static void main(String [] args) {
		Restaurant2 restaurant1 = new Restaurant2("McDonald's", 123456789, "123, howard ln, austin texas", 4);
		System.out.println(restaurant1.restaurantName);
	}

}
