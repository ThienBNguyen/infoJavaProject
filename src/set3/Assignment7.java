package set3;

public class Assignment7 {
	  public static boolean checkPalindrome(String str){
		    int len = str.length();
		    String reverse = "";
		    for(int i = len-1; i >= 0; i--) {
		    	char c = str.charAt(i);
		    	reverse = reverse + c;
		    }
		    if(reverse.equals(str)) {
		    	return true;
		    }else {
		    	return false;
		    }
		}
		
		public static void main(String args[]){
			String str = "radars";
			if(checkPalindrome(str))
				System.out.println("The string is a palindrome!");
			else
				System.out.println("The string is not a palindrome!");
		}

}
