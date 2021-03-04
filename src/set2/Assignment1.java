package set2;

public class Assignment1 {
	
	public static void main(String[] args) {
		int r,temp, sum= 0;
		int n = 454;
		
		temp= n;
		while(n> 0) {
			System.out.println("n " + n);
			r=n%10;
			System.out.println("r " + r);
			sum=(sum * 10)+r;
			System.out.println("sum " + sum);
			n=n/10;
			System.out.println("n/10 " + n);
		}
		if(temp==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palinddrome");
		}
	
	}
	
}

