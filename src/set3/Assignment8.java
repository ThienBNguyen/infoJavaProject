package set3;

public class Assignment8 {
    public static String reverseEachWord(String str){
 
        String[] words = str.split(" ");
        System.out.println(words.length);
        String reverseString = "";
        for(int i = 0; i < words.length; i++) {
        	String word = words[i];
        	System.out.println(word);
        	String reverseWord = "";
        	for (int j = word.length()-1; j>=0; j--) {
        		reverseWord = reverseWord + word.charAt(j);
        	}
        	reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
