package set1;

public class Assignment7 {
public static void main(String [] args) {
    //food conrner home delivers vegetarian

    int totalCost = 0;
    int deliveryFee = 0;
    int veg = 12;
    int nonVeg = 15;
    int distant = 6;
    int quantity = 1;
    char foodType = 'V';
    if (distant <= 3){
         if(foodType == 'N'){
            totalCost = nonVeg * quantity;
        }else if (foodType == 'V'){
            totalCost = veg * quantity;
        }
    }else if(distant > 3 && distant <= 6){
        distant = distant - 3;
        deliveryFee = distant * 1;
        if(foodType == 'N'){
            totalCost = nonVeg * quantity + deliveryFee;
        }else if (foodType == 'V'){
            totalCost = veg * quantity + deliveryFee;
        }
    }else if ( distant > 6){
        int firstdistant = (6 - 3);
        distant = 2 * (distant-6);
        deliveryFee = distant + firstdistant;
        if(foodType == 'N'){
            totalCost = nonVeg * quantity + deliveryFee;
        }else if (foodType == 'V'){
            totalCost = veg * quantity + deliveryFee;
        }
    }else{
        totalCost = -1;
    }
    System.out.println("food cost: "+  totalCost);

}
}
