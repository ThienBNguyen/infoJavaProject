package set2;
class Restaurant {
    public String restaurantName;
    public long restaurantContact;
    public String restaurantAddress;
    public float rating;
    public void DisplayRestaurantDetails(){
        System.out.println("Restaurant Details" + "\n **************");
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Restaurant Rating : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);

    }
}
public class Assignment6 {
	  public static void main(String [] args){
	        Restaurant restaurant = new Restaurant();
	        restaurant.restaurantName = "McDonald's";
	        restaurant.restaurantContact = 998886767;
	        restaurant.restaurantAddress = "234 howard austin texas";
	        restaurant.rating = 4;
	        restaurant.DisplayRestaurantDetails();
	    }
}