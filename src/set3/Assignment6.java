package set3;

public class Assignment6 {
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
    	int len = str.length();
    	String regx = "[a-zA-Z0-9\\s+]";
    	String res1 = "", res2 = "";
    	for(int i = 0; i < len; i++ ) {
    		char c = str.charAt(i);
    		if(String.valueOf(c).matches(regx)) {
    			res1 = res1+c;
    		}else {
    			
    				res2 = res2+c;
    		}
    		
    	}
    	return res1+ res2;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
