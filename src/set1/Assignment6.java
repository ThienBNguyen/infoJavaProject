package set1;

public class Assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculate the product of three positive intergert values
        int x = 1 , y = 5, z = 3;
        int total = 0;
        if(x == 7){
            total = x + y + z;
        }else if(y == 7) {
            total = z;
        }else if (z == 7){
            total = -1;
        }else{
            total = 7 + y + z;
        }
        System.out.println("Total: " + total);


	}
}
