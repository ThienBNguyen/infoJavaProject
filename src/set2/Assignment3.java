package set2;

public class Assignment3 {
	 public static void main(String [] args){
	        int n = 2250;
	        getSum(n);

	    }
	    static void getSum(int n){
	        int sum = 0;
	        int value = n;
	        while(n!=0){
	            sum = sum + n%10;
	            n=n/10;
	        }
	        if(n%sum == 0){
	           System.out.println(value + " is divisible by sum of its digits.");
	        }else {
	            System.out.println(value + " is not divisible by sum of its digits.");
	        }
	    }
}
