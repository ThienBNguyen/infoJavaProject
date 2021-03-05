package set3;
//leap year happen once every 4 years
//how do you know the years you pass in it is leap year
// first find the pass value if it is leap year or not
// if not find out when is the next leap year
//once find the leap years. add the next 15 leap year
//possible by adding 4 for the 15 times
public class Assignment4 {
	public static int[] findLeapYears(int year) {
		
		 int n = 15;
		 int count = 0;
		 int  leapYear[] = new int[n];
		 while(count != n) {
			 year = year + 1;
			 if((year% 400 ==0)||(year%4 ==0 && year % 100 !=0)) {
				 count++;
			 System.out.println(year);
				 leapYear[count] = year;
			 }
			
				
		 }
		System.out.println(leapYear);
		return leapYear;
	}
public static void main(String[] args) {
	int year = 2002;
	int[] leapYears;
	leapYears = findLeapYears(year); 
	System.out.println(leapYears);
	for(int index  = 0; index<leapYears.length; index++) {
		System.out.println(leapYears[index]);
	}
}
}


/// not complete 
